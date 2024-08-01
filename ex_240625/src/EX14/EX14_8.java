package EX14;

import java.io.File;
import java.util.stream.Stream;

public class EX14_8 {
    public static void main(String[] args) {
        //  map() - 스트림 요소 변환하기
        // peek() - 스트림의 요소를 소비하지 않고 엿보기, 중간 작업과정 확인할떄 사용
        // flatMap() - 스트림의 스트림으로 변환
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
        new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);   // 모든 파일 이름을 출력

        fileStream = Stream.of(fileArr);   // 스트림 다시 생성

        fileStream.map(File::getName)
                .filter(s -> s.indexOf(".")!= -1)  // 확장자가 없는 문자 제외
                .peek(s->System.out.printf("filename=%s\n", s))
                .map(s -> s.substring(s.indexOf(".")+1))  // 확장자만 추출
                .peek(s->System.out.printf("filename=%s\n", s))
                .map(String::toUpperCase)   // 모두 대문자로 변환
                .distinct()         // 중복 제거
                .forEach(System.out::println);

        System.out.println();


    }
}

