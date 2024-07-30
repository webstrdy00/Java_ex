package EX12;


import java.util.ArrayList;

class Fruit2{
    public String toString(){
        return "Fruit";
    }
}
class Apple2 extends Fruit2{public String toString(){return "Apple";}}
class Grape2 extends Fruit2{public String toString(){return "Grape";}}
class Juice{
    String name;
    Juice(String name){this.name = name;}
    public String toString(){return name;}
}
class Juicer{
    static Juice makeJuice(FruitBox2<? extends Fruit2> box){    // Fruit2에 자손들까지 매개변수로 가능하게 설정
        String tmp  = "";

        for(Fruit2 f :box.getList())
            tmp += f +" ";
        return new Juice(tmp);
    }
}
public class Ex12_4 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> friutBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();   // Fruite2와 그 자손들

        friutBox.add(new Apple2());
        friutBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(friutBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}
class FruitBox2<T extends Fruit2> extends Box2<T>{}
class Box2<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){list.add(item);}
    T get(int i){return list.get(i);}
    ArrayList<T> getList(){return list;}
    int size(){return list.size();}
    public String toString(){return list.toString();}
}


