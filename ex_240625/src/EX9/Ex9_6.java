package EX9;

public class Ex9_6 {
    public static void main(String[] args) { 
        // StringBuilder - StringBuffer는 동기화 되어있음 -> 멀티 쓰레드에 안전
        // 멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하 -> StringBuffer대신에 StringBuilder 사용하면 성능 향상
        // Meth 클래스
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;

        for (double d = 1.5; d<=10.5; d++){
            double d1 = Math.round(d);
            double d2 = Math.rint(d);

            System.out.printf("%4.1f %4.1f %4.1f\n", d, d1, d2);

            sum += d;
            sum1 += d1;
            sum2 += d2;
        }
        System.out.printf("%4.1f %4.1f %4.1f\n", sum, sum1, sum2);
    }
}




