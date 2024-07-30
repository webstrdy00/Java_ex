package EX11;

import java.util.*;

public class Ex11_4 {
    public static void main(String[] args) {
        // Iterator(단방향) - ListIterator(Iterator의 접근성을 향상시킨 것(양방향)
        // 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
        // 컬렉션에 iteratir()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
//        ArrayList c = new ArrayList();
        Collection c = new TreeSet();   // 조상이 같으므로 TreeSet를 HashSet으로 바꿀 수 있음 
//        Collection c = new HashSet();   // 
        
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();   // 이터레이터로 구현했기떄문에 컬렉션이 바뀌어도 코드를 그대로 사용가능
        
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        // iterator는 1회용이라 다쓰고나면 다시 얻어와야함
        it = c.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        
        // Map에는 iterator()가 없음 - keySet(), entrySet(), values()를 호출
    }
}




