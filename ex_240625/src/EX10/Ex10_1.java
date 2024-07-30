package EX10;

import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) { 
        // Calendar 클래스 - 추상 클래스이므로 getInstance()를 통해 구현된 객체를 얻어야 함
        // get()으로 날짜와 시간 필드 가져오기 (int get(int field))
        // set()으로 날짜와 시간지정
        Calendar today = Calendar.getInstance();
        System.out.println("년 도 : "+today.get(Calendar.YEAR));
        System.out.println("월 : "+today.get(Calendar.MONTH));
        System.out.println("이 해의 몇쨰 주 :"+today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇쨰 주 :"+today.get(Calendar.WEEK_OF_MONTH));

        System.out.println("이 달의 몇 일: "+today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일:"+today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일:"+today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1:일요일) : "+today.get(Calendar.DAY_OF_WEEK));
        System.out.println(today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(today.get(Calendar.AM_PM));
        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.HOUR_OF_DAY));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
        System.out.println(today.get(Calendar.MILLISECOND));
        System.out.println(today.get(Calendar.ZONE_OFFSET));
        System.out.println(today.getActualMaximum(Calendar.DATE));
    }
}




