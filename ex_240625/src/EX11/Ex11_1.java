package EX11;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class Ex11_1 {
    public static void main(String[] args) {
        // 컬렉션 프레임웍 핵심 - List, Set, Map
        // List - 순서가 잇는 데이터의 집합, 데이터의 중복을 허용
        // Set - 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않음
        // Map - 키와 값의 쌍으로 이루어진 데이터의 집합, 키는 중복허용하지 않고 값은 중복을 허용
        // ArrayList - 저장 순서가 유지, 중복 허용, 배열 사용
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(15);
        list1.add(57);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));

        list1.add(0, "1");
        System.out.println("index="+list1.indexOf("1"));  // indexof()는 지정된 객체의 위치(인덱스)를 알려줌

        list1.remove(0);
        list1.remove(new Integer(1));

        for(int i = list2.size() -1;i >= 0;i--){      // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : "+list1);
        System.out.println("list2 : "+list2);
        System.out.println( );
    }
}




