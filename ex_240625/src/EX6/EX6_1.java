package EX6;

public class EX6_1 {
    // 클래스 - 1. 설계도 2. 데이터+함수 3. 사용자정의타입
    public static void main(String[] args){
        // 객체지향 
        // 참조변수가 여러 인스턴스를 가리키는 경우 불가능
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.channel = 7;
        t2.channel = 15;

        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}
class Tv{
    // Tv의 속성
    String color; // 색상
    boolean power; // 전원
    int channel; // 채널
    // Tv의 기능(메서드)
    void power(){power = !power;}  // TV의 전원을 끄거나 키는 기능
    void channelUp(){++channel;} // TV의 채널을 높이는 기능
    void channelDown(){--channel;} // TV의 채널을 낮추는 기능
}
