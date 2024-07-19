package EX4;

import java.util.Scanner;

public class EX4_4 {
    public static void main(String[] args){
//        int i = 5;
//
//        while (i != 0){
//            i --;
//            System.out.println(i + " - I can do it.");
//        }
//        int sum = 0;
//        int i = 0;
//
//        while (sum <= 100){
//            System.out.printf("%d - %d\n", i, sum);
//            sum += ++i;
//
//        int num =0, sum = 0;
//        System.out.print("숫자를 입력하세요.(예:12345)>");
//
//        Scanner scanner = new Scanner(System.in);
//        String tmp = scanner.nextLine();
//        num = Integer.parseInt(tmp);
//
//        while (num != 0){
//            sum += num%10;
//            System.out.printf("sum=%3d num=%d\n", sum, num);
//
//            num /= 10;
//        }
//
//        System.out.println("각 자리수의 합: "+ sum);
        int input = 0, answer =0;

        answer = (int) (Math.random() * 100) +1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입룍하세요.>");
            input = scanner.nextInt();

            if (input > answer){
                System.out.println("더 작은 수로 다시 시도해보세요");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        }while (input != answer);

        System.out.println("정답입니다.");
    }
}
