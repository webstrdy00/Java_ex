package EX11;

import java.util.*;

public class Ex11_12 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("이동휘", new Integer(90));
        map.put("김일음", new Integer(100));
        map.put("남도일", new Integer(80));
        map.put("오자일", new Integer(75));
        map.put("고사니", new Integer(82));

        Set set = map.entrySet();   // 키,벨류 집합을 반환
        Iterator it = set.iterator();

        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : "+e.getKey()+", 점수 : "+e.getValue());
        }
        set = map.keySet();
        System.out.println("참가자 명단 : "+ set);

        Collection values = map.values();   // 값만 가져옴
        it = values.iterator();

        int total = 0;
        while (it.hasNext()){
            int i = (int) it.next();
            total += i;
        }

        System.out.println("총점 : "+ total);
        System.out.println("평균 : "+(float)total/set.size() );
        System.out.println("최고점수 : "+ Collections.max(values));
        System.out.println("최저점수 : "+Collections.min(values));
    }
}




