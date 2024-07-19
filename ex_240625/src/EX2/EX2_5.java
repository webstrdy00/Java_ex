package EX2;

import java.util.*;

public class EX2_5 {
    public static void main(String[] args){
        // println() 단점 - 출력형식 지정불가, 실수의 자리수 조절불가, 10진수로만 출력
        // printf() - 출력형식 지정가능

        // Scanner - 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
        // import java.util.*;

        Scanner scanner = new Scanner(System.in);

//        int num = scanner.nextInt();
//        System.out.println(num);

        String input = scanner.nextLine(); // 행단위로 받음
        int num = Integer.parseInt(input);

        System.out.println(num);
    }
}
