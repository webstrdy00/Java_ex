package EX11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_10 {
    public static void main(String[] args) {
        // TreeSet - 작은 값 왼쪽, 큰 값 오른쪽
        // 데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림
        TreeSet set = new TreeSet();
        int[] score = {80,95,50,84,20,35,66};

//        for (int i = 0;set.size() < 6;i++){
//            int num = (int) (Math.random()*45)+1;
//            set.add(num);
//        }
//        System.out.println(set);

        for (int i = 0;i<score.length;i++)
            set.add(new Integer(score[i]));

        System.out.println("50보다 작은 값 : "+set.headSet(50));
        System.out.println("50보다 큰 값 : "+set.tailSet(50));
        System.out.println("40과 80사이 값 : "+set.subSet(40, 80));
    }
}




