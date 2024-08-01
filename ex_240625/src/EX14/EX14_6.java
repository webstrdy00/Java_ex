package EX14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EX14_6 {
    public static void main(String[] args) {
        // 스트림(Stream) - 다양한 데이터 소스(컬렉션, 배열 등)를 표준화된 방법으로 다루기 위한 것, 원본 변경x(read only)
        // 1. 스트림 만들기 2. 중간 연산 3. 최종 연산
        // 스트림은 작업을 내부 반복으로 처리함, 병렬스트림
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::print);   // forEach() 최종연산
        System.out.println();

        String[] strArr = {"a","b","c","d"};
//        Stream<String> strStream = Stream.of(strArr);
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
//        intStream1.forEach(System.out::println);
//        System.out.println("count="+intStream1.count());     // Stream<Inteager> 로 생성하면 sum(), average() 같은 메소드 사용 불가
//        System.out.println("sum="+intStream1.sum());
        System.out.println("average="+intStream1.average());

//        IntStream intStream2 = new Random().ints();   // 무한 스트림
        IntStream intStream2 = new Random().ints(10, 5,10);   // 무한 스트림

//        intStream2.limit(5).forEach(System.out::println);
        intStream2.forEach(System.out::println);

        Stream<Integer> intStream3 = Stream.iterate(1, n->n+2);
        intStream3.limit(10).forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(()->1);
        oneStream.limit(10).forEach(System.out::println);
    }
}

