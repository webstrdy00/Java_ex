package EX9;

public class Ex9_5 {
    public static void main(String[] args) { 
        // StringBuffer - 문자열 배열(char[])을 내부적으로 가지고 있음
        // String과 달리 내용을 변경할 수 있음(mutable)
        // append() - 끝에 문자열 추가, delete() - 삭제, insert() - 삽입
        // equals()가 오버라이딩 되어있지 않음 -> String 변환 후에 equals()로 비교
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);
        System.out.println("sb = "+ sb);
        System.out.println("sb2 = "+sb2);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);
        System.out.println("sb3 = "+sb3);

        System.out.println(sb.deleteCharAt(10));
        System.out.println(sb.delete(3,6));
        System.out.println(sb.insert(3,"abc"));
        System.out.println(sb.replace(6, sb.length(), "END"));

        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}




