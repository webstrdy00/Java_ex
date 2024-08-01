package EX14;

public class EX14_1 {
    static void execute(MyFunction f) {   // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }
    static MyFunction getMyFunction(){
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }
    public static void main(String[] args) {
        // 람다식 작성하기 - 1. 메서드 이름과 반환타입을 제거하고 '->'를 블록{} 앞에 추가
        // 2. 반환값이 있는 경우, 식이나 값만 적고, return문 생략 가능
        // 3. 매개변수의 타입이 추론 가능하면 생략가능(대부분 생략 가능)
        // 주의사항 - 1. 매개변수가 하나인 경우, 괄호() 생략 가능(타입이 없을 떄만)
        // 람다식은 익명 객체임
        // 함수형 인터페이스 - 단 하나의 추상 메서드만 선언된 인터페이스
//        MyFunction mf = (a,b) -> a>b ? a:b;    // 람다식(함수형 인터페이스 필요)
//        int value = mf.max(3,5);
//        System.out.println(value);
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(()-> System.out.println("run()"));
    }
}
//@FunctionalInterface
//interface MyFunction{   // 람다식을 위한 함수형 인터페이스 정의
//    public abstract int max(int a, int b);
//}
interface MyFunction{
    void run();
}