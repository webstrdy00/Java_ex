package EX10;

import java.util.Calendar;

public class Ex10_5 {
    public static void main(String[] args) {
        // add()는 특정 필드 값을 증가 또는 감소(다른 필드에 영향을 줌)
        // roll()은 특정필드 닶을 증가 또는 감소(다른 필드에 영향을 안줌)
        Calendar date = Calendar.getInstance();
        date.set(2024, 7,1);

        System.out.println(toString(date));
        System.out.println("1일 후");
        date.add(Calendar.DATE ,1);
        System.out.println(toString(date));

        System.out.println("7달 전");
        date.add(Calendar.MONTH, -7);
        System.out.println(toString(date));
        
        // add()와 달리 roll()은 다른 필드에 영향을 주지 않음
        System.out.println("31일 후(roll)");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("31일 후(add)");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE) + "일 ";
    }
}




