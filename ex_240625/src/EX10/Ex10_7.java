package EX10;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.println("1,234,567.89"+ " -> ");

            double d = num.doubleValue();
            System.out.println(d + " - > ");

            System.out.println(df2.format(num));
        }catch (Exception e){
            e.printStackTrace();
        }
        
        // SimpleDateFormat - 날짜와 시간을 다양한 영식으로 출력할 수 있게 함
        DateFormat df3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df4 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d= df3.parse("2024년 7월 24일");
            System.out.println(df2.format(d));
        }catch (Exception e){

        }
    }
}




