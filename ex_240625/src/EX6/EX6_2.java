package EX6;

public class EX6_2 {
    public static void main(String[] args){
        // 변수 선언 위치 - 1. 클래스영역 2. 메서드영역
        // 공통 속성 - 클래스 변수, 개별 속성 - 인스턴스 변수
        // 메서드 - 1. 문장들을 묶어서 이름을 붙힌것 2. 값(입력)을 받아서 처리하고, 결과를 반환(출력)
        // 메서드 작성 - 반복적으로 수행되는 여러 문장을 메서드로 작성, 하나의 메서드는 한 가지 기능만 수행하도록 작성
        // 메서드 = 선언부 + 구현부
        // 반환타입 메서드이름( 타입변수명, 타입 변수명, ...)
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(5,3);
        mm.printGigidan(11);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}

class MyMath{
    void printGigidan(int dan){
        if(!(2<=dan&&dan <=9)){
            return;
        }
        for(int i = 0;i<9;++i){
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }
    }
    long add(long a, long b){
        long result = a+b;
        return result;
    }
    long max(long a, long b){
        if(a>b)
            return a;
        else if(a < b)
            return b;
        else
            return a;
    }
    long subtract(long a, long b){return a-b;}
    long multiply(long a, long b){return a*b;}
    double divide(double a, double b){
        return a/b;
    }
}
