package EX12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class Ex12_8 {
    public static void main(String[] args) {
        // 메타 애너테이션 - 애너테이션 만들때 사용
        // @Target - 적용대상 지정에 사용, @Retention - 애너테이션이 유지되는 기간을 지정하는데 사용
        // @Documented, @Inherited - 자손 클래스에 상속하고자 할 때
        // @Repeatable - 반복해서 붙일 수 잇는 애너테이션을 정의할 떄 사용, 컨테이너 애너테이션도 정의해야 함
        // 애너테이션 타입 정의하기 - @interface 애너테이션이름{ 타입 요소이름(); ...}
        // 요소가 하나이고 이름이 value일 때는 요소의 이름 생략가능
        // 애너테이션 요소의 규칙 - 1. 요소의 타입은 기본형, String, enum, 애너테이션, Class만 허용
        // 2. 괄호()안에 매개변수를 선언할 수 없음 3. 예외를 선언할 수 없음 4. 요소를 타입 매개변수로 정의할 수 없음
        Class<Ex12_8> cls = Ex12_8.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println(anno.testedBy());
        System.out.println(anno.testDate().yymmdd());
        System.out.println(anno.testDate().hhmmss());

        for(String str : anno.testTools())
            System.out.println(str);

        System.out.println();

        Annotation[] annoArr = cls.getAnnotations();

        for (Annotation a : annoArr)
            System.out.println(a);
    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
    int count() default 1;
    String testedBy();
    String[] testTools() default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}
@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
    String yymmdd();
    String hhmmss();
}
enum TestType{FIRST, FINAL}
