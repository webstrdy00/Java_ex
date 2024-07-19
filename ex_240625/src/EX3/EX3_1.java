package EX3;

public class EX3_1 {
    public static void main(String[] args){
        // 증감 연산자 - 증가 연산자(++), 감소 연산자(--)
        // 전위형 - 값이 참조되기 전에 증가
        // 후위형 - 값이 참조된 후에 증가

        int i=5, j=0;
        j = i++;
        System.out.println("j=i++; 실행 후, i="+ i +"j="+j);

        i=5;
        j=0;

        j=++i;
        System.out.println("j=i++; 실행 후, i="+ i +"j="+j);

        // 브호 연산자 = '-'는 피연산자의 부호를 반대로 변경
    }
}
