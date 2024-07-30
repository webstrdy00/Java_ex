package EX10;

import javax.xml.catalog.Catalog;
import java.util.Calendar;

public class Ex10_2 {
    public static void main(String[] args) { 
        final String[] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2023, 6, 14);  // 날짜 세팅
        System.out.println("date1은 "+toString(date1));
        System.out.println("오늘 date2은 "+toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");

        // 두 날짜간의 차이얻는 방법
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
        System.out.println("date1부터 지금까지 "+difference+"초가 지났습니다.");
        System.out.println("일(day)로 계산하면"+difference/(60*60*24)+"일 입니다.");
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE) + "일 ";
    }

}




