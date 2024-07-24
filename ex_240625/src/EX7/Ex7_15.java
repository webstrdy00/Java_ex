package EX7;

public class Ex7_15 {
    public static void main(String[] args) {
        // 인터페이스(interface) - 추상 메서드의 집합, 구현된 것이 전혀 없는 설계도(모든 멤버가 public)
        // 추상클래스 - 일반클래스인데 추상메서드를 가지고있는것(일부만 미완성), 인터페이스 - 추상메서드만 가지고있는것(전부 미완성)
        // 추상클래스와 인터페이스의 차이점 - 인터페이스는 iv를 가질 수 없음
//        interface 인터페이스이름{
//            public static final 타입 상수이름 = 값;
//            public abstract 메서드이름(매개변수목록);
//        }
        // 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
        // 다중 상속이 가능(추상메서드는 충돌해도 문제 없음)

        //인터페이스 구현 - 인터페이스에 정의된 추상 메서드를 완성하는 것
//        class 클래스이름 implements 인터페이스이름{
//            // 인터페이스에 정의된 추상메서드를 모두 구현해야 함
//        }
        // 일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함
        // 인터페이스를 이용한 다형성 - 인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능, 인터페이스를 메서드의 리턴타입으로 지정할 수 있음
        // 인터페이스 장점 - 두 대상(객체)간의 '연결, 대화, 소통'을 돕는 '중간 역할'을 함, 선언(설계)와 구현을 분리시킬 수 있게 함(변경에 유리함)
        // 개발 시간 단축, 변경에 유리한 유연한 설계가 가능, 표준화가 가능, 서로 관계없는 클래스들을 관계를 맺어줄 수 있음
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
        Fightable f2 = f.getFightable();
        System.out.println(f2);
    }
}
abstract class Unit2{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다.");
    }
}
interface Fightable{
    void move(int x, int y);  // public abstract 생략
    void attack(Fightable f);
}
class Fighter extends Unit implements Fightable{

    @Override
    public void move(int x, int y) {  // 오버라이딩 규칙 - 조상보다 접근제어자가 좁으면 안되서 public 붙여야함
        System.out.println("[x= " + x + ", y = "+y + "]로 이동");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    Fightable getFightable(){
        Fighter f = new Fighter();
        return f;
    }
}

