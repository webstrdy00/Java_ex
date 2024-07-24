package EX7;

public class Ex7_11 {
    public static void main(String[] args) {
        // 다형성 - 1. 조상매개변수로 자손 매개변수 생성 2. 참조변수의 형변환 3. instanceof 연산자
        // 매개변수의 다형성 - 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있음
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 "+ b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 "+ b.bonusPoint + "점입니다.");
    }
}
class Product{
    int price;  // 제품 가격
    int bonusPoint;  // 제품구매시 제공하는 보너스점수

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);    // 보너스점수는 제품가격의 10%
    }
}
class Tv extends Product{
    Tv(){   // 조상클래스의 생성자 Priduct(int price)를 호출
        super(100);  // Tv 가격을 100만원으로 설정
    }
    // Object 클래스의 toString()을 오버라이딩
    public String toString(){return "Tv";}
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){return "Computer";}
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+"을/를 구입하셨습니다.");
    }
}
