import java.util.Arrays;
import java.util.Scanner;

public class EX5_3 {
    public static void main(String[] args){
//        String[] strArr = {"가위", "바위", "보"};
//        System.out.println(Arrays.toString(strArr));
//
//        for(int i = 0;i<10;++i){
//            int tmp = (int) (Math.random() *3);
//            System.out.println(strArr[tmp]);
//        }

        String[][] words = {
                {"chair", "의자"},
                {"computer","컴퓨터"},
                {"integer","정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i =0;i< words.length;++i){
            System.out.printf("Q$%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if (tmp.equals(words[i][1])){
                System.out.println("정답입니다");
            }else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n", words[i][1]);
            }
        }
    }
}
