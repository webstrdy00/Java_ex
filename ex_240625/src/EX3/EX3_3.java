package EX3;

public class EX3_3 {
    public static void main(String[] args){
        // 반올림 - Math.round() - 실수를 소수점 첫 번째자리에서 반올림한 정수를 반환
        double pi = 3.141592;

        double shortPi = Math.round(pi *1000)/1000.0;
        System.out.println(shortPi); // 3.142

        // 3.141을 얻을려면
        System.out.println((int)(pi*1000)/1000.0);

        // 나머지 연산자 - % - 부호는 무시됨
        // 문자열 비겨 - equals() 사용
        // && - and연산자, || - or연산자
        // 논리 부정 연산자 - !
        // 대입 연산자 오른쪽에서 왼쪽
    }
}
