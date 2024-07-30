package EX10;

import java.util.Calendar;
import java.util.Scanner;

public class Ex10_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        // 월의 경우 0부터 11까지의 값을 가지므로 1을 뺴줘야 함
        sDay.set(year, month-1, 1);
        eDay.set(year, month, 1);

        // 다음달의 첫날에서 하루를 뺴면 마지막 날이 됨
        eDay.add(Calendar.DATE, -1);

        // 첫 번째 요리이 무슨 요일인지 알아내는 과정
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        //
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("      " + year +"년 " + month +"월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력
        for (int i =1;i<START_DAY_OF_WEEK;i++){
            System.out.print("   ");
        }
        for (int i =1, n=START_DAY_OF_WEEK; i<=END_DAY;i++, n++){
            System.out.print((i<10)?"  "+i : " "+i);
            if (n%7 == 0)
                System.out.println();
        }
    }
}




