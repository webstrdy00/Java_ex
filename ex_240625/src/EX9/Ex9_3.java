package EX9;

import java.util.Objects;

public class Ex9_3 {
    public static void main(String[] args) { 
        // hashCode() - 객체의 해시코드를 반환하는 메서드, 객체의 주소를 int로 변환해서 반환
        // equals()를 오버라이딩을 하면 hashCode()도 오버라딩해야함 - equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 떄문
        // toString() - 객체를 문자열(String)으로 변환하기 위한 메서드
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
    }
}
class Card{
    String kind;
    int number;

    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Card))
            return false;

        Card c= (Card) obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }
    // equals()를 오버라이딩하면 hashCode()도 오버라이딩
    public int hashCode(){
        return Objects.hash(kind,number);
    }
    
    // Object클래스의 toString()을 오버라이딩
    public String toString(){
        return "kind: " + kind +", number: " + number;
    }
}



