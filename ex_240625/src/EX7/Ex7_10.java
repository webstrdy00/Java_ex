package EX7;

public class Ex7_10 {
    public static void main(String[] args) {
        // 다형성(polymorphism) - 조상 타입 참조 변수로 자손 타입 객체를 다루는 것(타입 불일치)
        // 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없음
        // 참조변수가 조상타입일 떄와 자손타입일 떄의 차이? - 참조변수로 사용할 수 있는 멤버의 갯수가 달라짐
        // 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없음
        
        // 참조변수의 형변환 - 사용할 수 있는 멤버의 갯수를 조절하는 것
        // 조상 자손 관계의 참조변수는 서로 형변환 가능(상속 관계가 아닌 클래스 간의 형변환 불가능)
//        Car car = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//
//        fe.water();
//        car = fe;
////        car.water();  // 불가능
//        fe2 = (FireEngine) car;
//        fe2.water();
//
//        Car car = null;
//        FireEngine fe = null;
//
//        FireEngine fe2 = (FireEngine) car;
//        Car car2 = (Car) fe;
//        car2.drive();  // NullPointerException 발생
//
//        Car c = new Car();
//        FireEngine fe1 = (FireEngine) c; // 형변환 실행 에러 ClassCastException
//        fe.water(); // 컴파일 오케이

        // instanceof 연산자 - 참조변수의 형변환 가능여부 확인에 사용( 가능하면 true 반환)
        // 형변환 전에 반드시 instanceof로 확인해봐야 함

        FireEngine fe3 = new FireEngine();
        System.out.println(fe3 instanceof Object);
        System.out.println(fe3 instanceof Car);
        System.out.println(fe3 instanceof FireEngine);
    }
}
class Car{
    String color;
    int door;

    void drive(){
        System.out.println("dirve~~~");
    }
    void stop(){
        System.out.println("stop!!!!");
    }
}
class FireEngine extends Car{ // 소방차
    void water(){
        System.out.println("water!!");
    }
}

