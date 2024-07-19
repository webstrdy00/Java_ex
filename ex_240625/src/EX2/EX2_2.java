package EX2;

public class EX2_2 {
    public static void main(String[] args){
        // 변수 - 하나의 값을 저장하기 위한 공간(변경 o), 상수 - 한 번만 값을 저장 가능한 변수(변경 x, final을 붙임)
        // 변수 타입
        // boolean - true, false - 논리형(1byte)
        // chat - 문자(2byte)
        // int - 정수(4byte)
        // double - 실수형(8byte)

        int x = 4, y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        final int score = 100;
        System.out.println(score);

        byte b = 127; // -128~127

        int oct = 010;
        int hex = 0x10;

        long l = 10_000_000_000L;

        float f = 3.14f;
        double d= 3.14f;
        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);
    }
}
