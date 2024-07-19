package EX5;

import java.util.Arrays;
import java.util.Scanner;

public class EX5_1 {
    public static void main(String[] args){
        // 배열
        // 인덱스의 범위는 0부터 시작 배열길이는 -1
//        int[] score = new int[5];
//        score[3] = 100;
//
//        for(int i =0;i<score.length;++i){
//            System.out.printf("score[%d] = %d\n",i,score[i]);
//        }

        // 배열이름.length - 배열의 길이(int형 상수)

//        int[] iArr = {100,95,80,70,60};
//
//        for (int i = 0;i<iArr.length;i++){
//            System.out.println(iArr[i]);
//        }
//
//        System.out.println(Arrays.toString(iArr)); // 배열을 문자열로 만들어서 출력

        int[] iArr1 = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = {100,95,80,70,60};
        char[] chArr = {'a','b','c','d'};

        for(int i =0;i<iArr1.length;++i){
            iArr1[i] = i+1;
        }

        for(int i = 0;i<iArr2.length;++i){
            iArr2[i] = (int)(Math.random()*10) +1;
        }

        for (int i = 0;i<iArr1.length;i++){
            System.out.println(iArr1[i]);
        }

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(chArr);
    }
}
