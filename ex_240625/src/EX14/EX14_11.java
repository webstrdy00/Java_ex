package EX14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EX14_11 {
    public static void main(String[] args) {
        // 스트림 최종연산 - forEach(), allMatch(), anyMatch(), noneMatch(), reduce(), collect(), findFirst(), findAny()
        // forEach(), forEachOrdered() - 스트림의 모든 요소에 지정된 작업을 수행(병렬일때 두 명령어 차이 forEachOrdered 사용)
        // allMatch(), anyMatch(), noneMatch() - 조건 검사
        // findFirst(), findAny() - 조건에 일치하는 요소 찾기
        // reduce() - 스트림의 요소를 하나씩 쥴여가며 누적연산 수행
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr)
                .parallel()   // 병렬로 처리
                .forEachOrdered(System.out::println);   // 병렬로 처리할떄 순서를 유지하고 싶을떄 사용

        boolean notEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
        Optional<String> sword = Stream.of(strArr)
                .filter(s->s.charAt(0)=='s').parallel().findAny();

        System.out.println(notEmptyStr);
        System.out.println(sword.get());

        // Stream<String>을 IntStream으로 변환
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a,b)->a+1);
        int sum = intStream2.reduce(0, (a,b)->a+b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println(count);
        System.out.println(sum);
        System.out.println(max.getAsInt());
        System.out.println(min.getAsInt());
    }
}

