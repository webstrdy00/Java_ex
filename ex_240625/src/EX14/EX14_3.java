package EX14;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class EX14_3 {
    public static void main(String[] args) {
        // Predicate의 결합
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);

        Function<String, String> h = f.andThen(g); // f와 g를 연결해서 사용( f가 먼자 사용됨 )
        Function<Integer, Integer> h2 = f.compose(g); // f와 g를 연결해서 사용( g가 먼저 사용됨 )

        System.out.println(h.apply("FF"));
        System.out.println(h2.apply(2));

        Function<String, String> f2 = x -> x; // 항등 함수(identity Function)
        System.out.println(f2.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 ==0;
        Predicate<Integer> notP = p.negate(); // p의 !형( i -> i>= 100)

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));

        String str1 = new String("abc");
        String str2 = new String("abc");

        // str1과 str2가 같은지 비교한 결과를 반환
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}

