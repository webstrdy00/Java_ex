public class EX6_3 {
    public static void main(String[] args){
        // 기본형 매개변수 - 변수의 값을 읽기만 할 수 있음
        // 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있음

        // 기본형 매개변수 예제
        Data_basic d = new Data_basic();
        d.x = 10;
        System.out.println(d.x);

        change(d.x);
        System.out.println(d.x);

        // 참조형 매개변수 예제
        Data2 d2 = new Data2();
        d2.x = 10;
        System.out.println(d2.x);

        change2(d2);
        System.out.println(d2.x);

        // 참조형 매개변수 예제 2
        Data3 d3 = new Data3();
        d3.x = 10;
        System.out.println(d3.x);

        Data3 d4 = copy(d3);
        System.out.println(d4.x);
    }
    // 기본형 매개변수
    static void change(int x){
        x= 1000;
        System.out.println(x);
    }
    // 참조형 매개변수
    static void change2(Data2 d){
        d.x = 1000;
        System.out.println(d.x);
    }
    static Data3 copy(Data3 d){
        Data3 tmp = new Data3();
        tmp.x = d.x;
        return tmp;
    }
}
class Data_basic {int x;}
class Data2{int x;}
class Data3{int x;}

