package EX2;

public class EX2_6 {
    public static void main(String[] args){
        // 문자열로 변환 - 빈문자열을 더해주면 됨
        // 문자열을 숫자로 변환 - Integer.parseInt("3"), Double.parseDouble("3.4")
        String str = "3";

        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' +1);
        System.out.println(Integer.parseInt("3") +1);
        System.out.println("3" +1);
        System.out.println(3 + '0');
    }
}
