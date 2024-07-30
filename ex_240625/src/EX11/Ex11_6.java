package EX11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_6 {
    public static void main(String[] args) {
        // Comparator, Comparable(기본정렬기준제공) - 객체 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);  // 대소문자 구분 안함
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 역순 정렬
        System.out.println(Arrays.toString(strArr));
    }
}
class Descending implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}




