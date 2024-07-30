package EX11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex11_5 {
    public static void main(String[] args) {
        // Arrays - toString(), copyOf(), copyOfRange(), fill(), setAll(), sort(), binarySearch(), deeToString(), deepEquals(), asList
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13},{21,22,23}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2,4);
        int[] arr6 = Arrays.copyOfRange(arr, 0,7);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println(Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
        System.out.println(Arrays.toString(arr7));

        for (int i : arr7){   // 향상된 for문
//            for (int x = 0;x<arr7.length;x++)
//                int i = arr7[x];
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }
    }
}




