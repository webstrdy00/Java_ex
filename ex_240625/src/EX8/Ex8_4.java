package EX8;

import java.io.File;
import java.io.IOException;

public class Ex8_4 {
    public static void main(String[] args) {
       // 사용자 정의 예외 - 조상을 Exception과 RuntimeException 중에서 선택
//        class MyException extends Exception{
//            MyException(String msg){
//                super(msg);    // 조상인 Exception 클래스의 생성자를 호출
//            }
        class MyException extends Exception{
            private final int ERR_CODE;
            MyException(String msg, int errCode){
                super(msg);
                ERR_CODE = errCode;
            }

            MyException(String msg){
                this(msg, 100);
            }
            public int getErrCode(){  // 에러 코드를 얻을 수 잇는 메서드 추가
                return ERR_CODE;    // 주로 getMessage()와 함께 사용
            }
        }
        // 예외 되던지기(exception re-throwing) - 예외를 처리한 후에 다시 예외를 발생시키는 것, 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것
        try {
            method1();
        }catch (Exception e){
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }
    static void method1() throws Exception{
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;
        }
    }
}



