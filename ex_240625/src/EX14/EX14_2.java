package EX14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EX14_2 {
    public static void main(String[] args) {
        // java.util.function패키지 - 자주 사용되는 다양한 함수형 인터페이스를 제공
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 제공자 - 입력은 없고 리턴은 있음
        Consumer<Integer> c = i -> System.out.print(i+", ");  // 소비자 - 입력만받고 리턴 x
        Predicate<Integer> p = i -> i%2 == 0;    // 입력받고 boolean값으로 리턴
        Function<Integer, Integer> f = i -> i/10*10;  // 입력과 리턴 둘다있음

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }
    static <T> List<T> doSomething(Function<T, T> f, List<T> list){     // 배열에 일의 자리수를 0으로 만들어서 새로운 배열 생성하는 메서드(ex 78 -> 70)
        List<T> newList = new ArrayList<T>(list.size());

        for (T i : list)
            newList.add(f.apply(i));
        return newList;
    }
    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){    // 배열에 짝수인 값만 출력하는 메서드 
        System.out.print("[");
        for (T i : list){
            if (p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }
    static <T> void makeRandomList(Supplier<T> s,List<T> list){  // 배열에 랜덤으로 10개의 값을 넣은 메서드
        for (int i = 0;i<10;i++)
            list.add(s.get());
    }
}

