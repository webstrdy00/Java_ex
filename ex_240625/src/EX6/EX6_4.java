package EX6;

public class EX6_4 {
    public static void main(String[] args){
        // static 메서드 - 객체생성없이 호출 가능한 메서드
        // Iv - 인스턴스 변수
        // static을 붙이는 구분 - Iv를 사용하지 않으면 static를 붙이고 Iv를 사용하면 static를 붙이지 않음
        // static - 1. 속성중에서 공통 속성에 static을 붙임 2. 인스턴스 멤버을 사용하지 않는 메서드에 static을 붙임
        // static 메서드 - 인스턴스 변수, 인스턴스 메서드 호출 불가능

        // 오버로딩 - 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것
        // 오버로딩 성립 조건 - 1. 메서드 이름이 같아야 함 2. 매개변수의 개수 또는 타입이 달라야 함 3. 반환 타입은 영향이 없음\
    }
}
// 오버로딩 예제
class MyMath3{
    int add(int a, int b){
        return a+b;
    }
    long add(long a, long b){
        return a+b;
    }
    int add(int[] a){
        int result = 0;
        for (int i = 0;i<a.length;++i){
            result += a[i];
        }
        return result;
    }
}

