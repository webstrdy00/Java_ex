package EX14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EX14_4 {
    public static void main(String[] args) {
        // java.util.function패키지 - 자주 사용되는 다양한 함수형 인터페이스를 제공
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<10;i++)
            list.add(i);

        // list 모든 요소 출력
        list.forEach(i -> System.out.print(i +", "));
        System.out.println();

        // list에서 2 또는 3의 배수 제거
        list.removeIf(x -> x%2 ==0 || x%3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i*10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map의 모든 요소를 (k,v)의 형식으로 출력
        map.forEach((k,v) -> System.out.print("{"+k+","+v+"}"));
        System.out.println();
    }
}

