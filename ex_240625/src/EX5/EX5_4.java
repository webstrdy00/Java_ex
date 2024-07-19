package EX5;

import java.util.Arrays;
import java.util.Scanner;

public class EX5_4 {
    public static void main(String[] args){
//        // String클래스 - char[]와 메서드(기능)를 결합한 것, 내용을 변경할 수 없음
//        String str = "ABCDE";
//        char ch = str.charAt(3);
//        System.out.println(ch);
//
//        String str2 = str.substring(1, 4);
//        System.out.println(str2);
//
//        String str3 = str.substring(1, str.length());
//        System.out.println(str3);

        // Ayyays - equals(), deepEquals(), copyOf(), copyOfRange(), sort()
        int[] arr = {0,1,2,3,4};
        int[][] arr2D ={{11,12},{21,22}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"ccc","ddd"},{"AAA","BBB"}};
        String[][] str2D2 = {{"ccc","ddd"},{"AAA","BBB"}};

        System.out.println(Arrays.deepEquals(str2D,str2D2));

        int[] arr2 = Arrays.copyOfRange(arr,2,4);
        System.out.println(Arrays.toString(arr2));
    }
}
