import java.util.Arrays;

public class EX5_2 {
    public static void main(String[] args){
//       int sum = 0;
//       float average = 0f;
//
//       int[] score = {100, 88, 100,100, 90};
//
//       for (int i =0;i<score.length;++i){
//           sum += score[i];
//       }
//       average = sum/(float)score.length;
//
//        System.out.println(sum);
//        System.out.println(average);

//        int[] score = {79, 22, 80, 99, 101, 23};
//
//        int max = score[0];
//        int maxnum = 0;
//        int min = score[0];
//        int minnum = 0;
//
//        for(int i = 0;i<score.length;++i){
//            if(score[i] > max){
//                max = score[i];
//                maxnum = i;
//            } else if (score[i] < min) {
//                min = score[i];
//                minnum = i;
//            }
//        }
//
//        System.out.printf("score[%d] = %d\n",maxnum, max);
//        System.out.printf("score[%d] = %d\n",minnum, min);

        int[] ball = new int[45];

        for(int i = 0;i<ball.length;++i)
            ball[i] = i+1;
        System.out.println(Arrays.toString(ball));

        int tmp = 0;
        int j = 0;

        for(int i = 0;i<6;i++){
            j = (int)(Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
            System.out.println(Arrays.toString(ball));
        }
    }
}
