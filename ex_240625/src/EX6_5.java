public class EX6_5 {
    public static void main(String[] args){
        // 생성자 - 인스턴스가 생성될 떄마다 호출되는 인스턴스 초기화 메서드
        // 이름이 클래스 이름과 같음, 리턴값이 없음(void 안붙임). 모든 클래스는 반드시 생성자를 가져야 함
        // 생성자 this() - 생성자에서 다른 생성자를 호출할 떄 사용, 다른 생성자 호출시 첫 줄에서만 사용가능, 클래스 이름대신 사용
        // 참조변수 this - 인스턴스 자신을 가리키는 참조변수, 인스턴스 메서드(생성자 포함)에서 사용가능, 지역변수(lv)와 인스턴스 변수(iv)를 구별할 떄 사용
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
    }
}
class Data_1{
    int value;
}
class Data_2{
    int value;

    Data_2(){};
    Data_2(int x){
        value = x;
    }
}

