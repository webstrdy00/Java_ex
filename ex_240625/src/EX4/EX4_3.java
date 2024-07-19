package EX4;

import java.util.Scanner;

public class EX4_3 {
    public static void main(String[] args){
        // Math.random() - 0.0과 1.0임의의 double 값을 반환
        int num = 0;

        for(int i=1;i<=5;++i){
            num = (int) (Math.random() * 6)+1;
            System.out.println(num);
        }
    }
}
