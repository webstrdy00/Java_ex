package EX7;

public class Ex7_17 {
    public static void main(String[] args) {
        // 인터페이스에 새로운 메서드(추상 메서드)를 추가하기 어려움 - 해결책 -> 디폴트 메서드
        // 디폴트 메서드가 기존의 메서드와 충돌할 떄의 해결책 
        // 1. 여러 인터페이스의 디폴트 메서드 간의 충돌 -> 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 함
        // 2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌 -> 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시됨
        
        // 내부 클래스 - 클래스 안의 클래스
        // 내부 클래스 장점 - 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있음, 코드의 복잡성을 줄일 수 있음(캡슐화)
        // 내부 클래스의 종류와 유효범위(scope)는 변수와 동일, 내부 클래스의 제어자는 변수에 사용 가능한 제어자와 동일
        A1 a = new A1();
        a.b.method();
    }
}
class A1{ // B1의 외부 클래스
    int i = 100;
    B1 b = new B1();
    class B1{   // A1의 내부 클래스
        void method(){
//            A1 a = new A1();
//            System.out.println(a.i);
            System.out.println(i);  // 객체 생성없이 외부 클래스의 멤버 접근가능
        }
    }
}

//class C1{
//    B1 b = new B1();
//}

