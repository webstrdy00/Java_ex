package EX9;

public class Ex9_4 {
    public static void main(String[] args) { 
        // String클래스 = 데이터(char[]) + 메서드(문자열 관련), 내용을 변경할 수 없는 불변(immutable)클래스
        // 문자열 결합이나 변경이 자주 일어나면 덧셈 연산자(+) 결합보다 StringBuffer를 사용
        // 문자열 리터럴 - 프로그램 실행시 자동으로 생성, 같은 내용의 문자열 리터럴은 하나만 만들어짐
        // join() - 여러 문자열 사이에 구분자를 넣어서 결합
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("-", arr);
        System.out.println(str);

        // 숫자를 문자열로 바꾸는 방법
        int i = 100;
        String str1 = i+""; // 100을 "100"으로 변환하는 방법1
        String str2 = String.valueOf(i);  // 100을 "100"으로 변환하는 방법2
        // 문자열을 숫자로 바꾸는 방법
        int i1 = Integer.parseInt("100");  // old
        int i2 = Integer.valueOf("100");  // new
    }
}




