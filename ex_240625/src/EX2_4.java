public class EX2_4 {
    public static void main(String[] args){
        // 기본형(boolean, char, byte, short, int, long, float, double)
        // 참조형

       int x= 4, y =2;
       int tmp;

       tmp = x;
       x = y;
       y = tmp;

        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
