package EX11;

import java.util.*;

public class Ex11_8 {
    public static void main(String[] args) {
        // HashSet(순서 x, 중복 x) - 기존에 같은 객체가 있는지 확인 없으면 저장. 있으면 저장하지 않음
        // bolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출 --> equals()와 hashCode()를 오버라이딩해줘야함
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 중복이라 저장안됨
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}
// equals()와 hashCode()를 오버라이딩 해야함
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person)) return false;

        Person p = (Person) o;

        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}




