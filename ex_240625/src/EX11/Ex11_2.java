package EX11;

import java.util.*;

public class Ex11_2 {
    public static void main(String[] args) {
        // 배열의 장단점
        // 장점 - 배열의 구조가 간단하고 데이터를 읽는 데 걸리는 시간이 짧음
        // 단점 - 크기를 변경할 수 없음, 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸림
        // LinkedList - 배열의 단점을 보완, 불연속적으로 존재하는 데이터를 연결, 데이터 접근성이 나쁨
        // 데이터 삭제 - 한 번의 참조변경만으로 가능, 데이터 추가 - 한번의 Node객체생성과 두 번의 참조변경으로 가능
        // 링크드 리스트, 더블리 링크드 리스트 - 이중 연결리스트. 접근성 향상, 더블리 써큘러 링크드 리스트 - 이중 원형 연결리스트
        // ArrayList vs LinkedList
        // 순차적 데이터 추가/삭제 - ArrayList 빠름, 비순차적 데이터 추가/삭제 - LinkedList 빠름, 접근시간 - ArrayList 빠름
        //
        Stack st = new Stack<>();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("=Stack=");
        while (!st.empty()){
            System.out.println(st.pop());
        }

        System.out.println("=Queue=");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}




