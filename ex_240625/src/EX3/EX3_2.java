package EX3;

public class EX3_2 {
    public static void main(String[] args){
        // 형변환
        // 자동 형변환 - 작은 쪽을 큰 쪽에 넣을떄는 자동 형변환 반대는 수동 형변환

        // 산술 변환 - 연산 전에 피연산자의 타입을 일치시키는 것
        // 규칙 2가지 - 1. 두 피연산자의 타입을 같게 일치시킨다 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환
        int a = 1_000_000; // 1,000,000 1백만 = 10의 6제곱
        int b = 2_000_000; // 2,000,000 2백만 = 10의 6제곱
        
        // 10의 12제곱  int의 범위는 10의 9제곱
        long c = (long) a*b;

        System.out.println(c);
    }
}
