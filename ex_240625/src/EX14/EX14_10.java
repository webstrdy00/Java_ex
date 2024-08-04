package EX14;

import java.util.Optional;
import java.util.OptionalInt;

public class EX14_10 {
    public static void main(String[] args) {
        // Optional<T> - T 타입 객체의 래퍼클래스(간접적으로 null 다루기)
        // 1. null을 직접 다루는것은 위험(NUllPointException 발생) 2. null체크 -> if문필수 코드가 지저분해짐
        // null대신 빈 Optional<T>객체 사용
        // 생성 Optional.of() 사용, Option 값 가져오기 - get(), orElse(),orElseGet(), orElseThrow()
        // isPresent() - 값이 null이면 false 아니면 true 반환
//        Optional<String> opt = Optional.empty();
        Optional<String> opt = Optional.of("abc");
        System.out.println(opt);

        String str ="";

//        str = opt.orElse("EMPTY");   // Optional 저장된 값이 null이면 "EMPTY" 반환
//        str = opt.orElseGet(() -> "EMPTY");
        str = opt.orElseGet(String::new);
        System.out.println(str);

        // OptionalInt, OptionalLong, OptionalDouble - 기본형 값을 감싸는 래퍼클래스
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println(optStr.get());
        System.out.println(optInt.get());

        int result = Optional.of("123")
                .filter(x -> x.length() >0)
                .map(Integer::parseInt).get();

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println(result);
        System.out.println(result2);

        Optional.of("456").map(Integer::parseInt).ifPresent(x->System.out.printf("result = %d\n", x));
//        Optional.of("").map(Integer::parseInt).ifPresent(x->System.out.printf("result = %d\n", x)); // 에러 발생

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();

        System.out.println(optInt1.isPresent());
        System.out.println(optInt2.isPresent());

        System.out.println(optInt1.getAsInt());
//        System.out.println(optInt2.getAsInt());
        System.out.println(optInt1);
        System.out.println(optInt2);
        System.out.println("optInt1.equals(optInt2)"+optInt1.equals(optInt2));
    }
}

