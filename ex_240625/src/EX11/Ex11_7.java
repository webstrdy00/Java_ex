package EX11;

import java.util.*;

public class Ex11_7 {
    public static void main(String[] args) {
        // HashSet - set인터페이스를 구현한 대표적인 컬렉션 클래스
        // 순서를 유지하려면 - LinkedHashSet 사용, TreeSet - 범위 검색과 정렬에 유리, HashSet보다 데이터 추가 삭제에 시간이 더 걸림
//        Object[] objArr = {"1", new Integer(1), "2", "2","3","3","4","4","4"};
//        Set set = new HashSet();
//
//        for (int i = 0;i<objArr.length;i++){
//            System.out.println(set.add(objArr[i]));
//        }
//
//        System.out.println(set);
//
//        Iterator it = set.iterator();
//
//        while (it.hasNext())
//            System.out.println(it.next());

        Set set = new HashSet();

        for (int i = 0;set.size() <6;i++){
            int num = (int)(Math.random()*45) +1;
            set.add(num);
        }
        System.out.println(set);
        
        List list = new LinkedList(set);     // set은 sort사용 불가 -> list로 변환후에 정렬
        Collections.sort(list);
        System.out.println(list);
    }
}




