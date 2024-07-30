package EX11;

import java.util.*;

import static java.util.Collections.*;

public class Ex11_14 {
    public static void main(String[] args) {
        // Collections - fill(0, copy(), sort(), binarySearch() 등
        // 컬렉션의 동기화 - synchronized(), 변경 불가능 컬렉션 만들기 - unmodifiabled()
        // 싱글톤 - singletion(), 한 종류의 객체만 저장하는 컬렉션 만들기 - checked()
        List list = new ArrayList();
        System.out.println(list);

        Collections.addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2);   // 오른쪽으로 2칸 이동
        System.out.println(list);

        swap(list,0,2); // 첫번쨰와 세번째를 교환
        System.out.println(list);

        shuffle(list);   // 저장된 요소의 위치를 임의로 변경
        System.out.println(list);

        sort(list, reverseOrder());   // 역순 정렬 reverse(list)와 동일
        System.out.println(list);

        sort(list);   // 정렬
        System.out.println(list);

        int idx = binarySearch(list, 3);   // 3이 저장된 위치
        System.out.println("index of 3 = "+idx);

        System.out.println(max(list));
        System.out.println(min(list));
        System.out.println(max(list, reverseOrder()));    // 반대 정렬 방식

        fill(list, 9);
        System.out.println(list);

        List newList = nCopies(list.size(), 2);   // list와 같은 크기의 새로운 list를 생성하고 2로 채움
        System.out.println("newList="+newList);

        System.out.println(disjoint(list, newList));  //  공통요소가 없으면

        copy(list, newList);
        System.out.println(newList);
        System.out.println(list);

        replaceAll(list,2,1);
        System.out.println(list);
    }
}




