package EX7;

// 상속 예제
class Tv1{
    boolean  power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

    class SmartTv extends Tv1{ // SmartTv는 TV에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;           // 캡션상태(on/off)
    void displayCaption(String text){ 
        if (caption){                // 캡션 상태가 on(true)일 떄만 text를 보여 줌
            System.out.println(text);  
        }
    }
}

// 
public class EX7_1 {
    public static void main(String[] args){
        // 상속(Inheritance) - 기존의 클래스로 새로은 클래스를 작성하는 것
        // 두 클래스를 부모와 자식으로 관계를 맺어줌
        // class 자식클래스 extands 부모클래스
        // 자식은 부모의 모든 멤버를 상속받음, 자손의 멤버 개수가 부모보다 적을 수 없음(같거나 많음)
        // 자식의 변경은 부모에 영향을 미치지 않음
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, world");
        stv.caption = true;
        stv.displayCaption("Hello, world");
        
        // 포함(composite) - 클래스의 멤버로 참조변수를 선언하는 것
        // 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만듬
        // 상속관계 - '~은 ~이다'(is-a), 포홤관계 - '~은 ~을 가지고 있다(has-a)
    }
}

