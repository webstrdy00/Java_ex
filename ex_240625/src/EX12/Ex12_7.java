package EX12;
class Parent{
    void parentMethod(){}
}
class Child extends Parent{
    @Override
    @Deprecated
    void parentMethod(){}
}
@FunctionalInterface  // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testable{
    void test();
//    void check();
}
public class Ex12_7 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // 애너테이션 - 주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
        // @Override, @Deprecated - 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙임
        // @Functionallnterface - 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성햇는지 체크, 하나의 추상메서드만 가져야 함
        // @SuppressWarnings - 컴파일러의 경고메시지가 나타나지 않게 억제
    }
}


