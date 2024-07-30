package EX12;

import javax.swing.*;
import java.util.ArrayList;

interface Eatable{}
class Fruit implements Eatable{
    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{public String toString(){return "Apple";}}
class Grape extends Fruit{public String toString(){return "Grape";}}
class Toy{public String toString(){return "Toy";}}
public class Ex12_3 {
    public static void main(String[] args) {
        // 지네릭스 제약
        // 1. static멤버에 타입 변수 사용 불가(인스턴스 별로 다르게 가능하기떄문에) 2. 배열 생성할 때 타입 변수 사용불가. 타입 변수로 배열 선언은 가능
        // 와일드 카드 <?> - <? extends T> : 와일드 카드의 상한 제한, T와 그 자손들만 가능
        // 와일드 카드 - 하나의 참조변수로 서로 다른 타입이 대입된 려어 지네릭 객체를 다루기 위한 것 
        // 지네릭 메서드 - 메서드를 호출할 때마다 다른 지네릭 타입을 대입할 수 있게 한 것
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        Box<Toy> toyBox = new Box<Toy>();  // Box에는 가능
        FruitBox<? extends Fruit> fbox = new FruitBox<Fruit>();
        FruitBox<? extends Fruit> abox = new FruitBox<Apple>();// FruitBox<Apple> -> FruitBox<? extends Fruit>
        // FruitBox<? exteds Fruit> -> FruitBox<Apple> 가능
        FruitBox<Apple> appleBox2 = (FruitBox<Apple>) abox;

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Grape());   // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());
    }
}
class FruitBox<T extends Fruit & Eatable> extends Box<T>{

}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();   // item을 저장할 list
    void add(T item){list.add(item);} // 박스에 item을 추가
    T get(int i){return list.get(i);} // 박스에서 item을 꺼낼때
    int size(){return list.size();}
    public String toString(){return list.toString();}
}

