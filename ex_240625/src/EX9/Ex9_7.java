package EX9;

import java.util.ArrayList;

public class Ex9_7 {
    public static void main(String[] args) { 
        // 래퍼(wrapper) 클래스 - 8개의 기본형을 객체로 다뤄야할 떄 사용하는 클래스
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? "+ (i==i2));
        System.out.println("i.equals(i2) ? "+i.equals(i2));
        System.out.println("i.compareTo(i2)="+i.compareTo(i2));
        System.out.println("i.toString()="+i.toString());
        // 기본형의 값을 객체로 자동변환하는 것을 오토박싱, 그 반대는 언박싱

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100));
        list.add(100);

//        Integer i = list.get(0);
        int i3 = list.get(0);
    }
}




