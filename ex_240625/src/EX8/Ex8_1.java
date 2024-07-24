package EX8;

public class Ex8_1 {
    public static void main(String[] args) {
        // 프로그램 오류 - 1. 컴파일 에러: 컴파일 할 떄 발생하는 에러 2. 런타임 에러: 실행 할 때 발생하는 에러 3. 논리적 에러: 작성 의도와 다르게 동작
        // 에러 - 심각한 오류, 예외(exception) - 미약한 오류
        // 예외처리 - 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
        // Exception 클래스들 - 사용자의 실수와 같은 외적인 요인에 의해 발생하는 에외, RuntimeException클래스들 - 프로그래머의 실수로 발생하는 예외
//        try {
//            // 예외가 발생할 가능성이 잇는 문장들을 넣는다.
//        } catch (Exception e1){
//           // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적음
//        }catch (Exception e2){
//          // Exception2이 발생했을 경우, 이를 처리하기 위한 문장을 적음
//        }catch (Exception e3){
//          // Exception3이 발생했을 경우, 이를 처리하기 위한 문장을 적음
//        }
        // try-catch문 흐름 - 1. 예외가 발생하면, 이를 처리할 catch 블럭을 찾아 내려감  2. 일치하는 catch블럭이 없으면, 예외는 처리 안됨 3. Exception이 선언된 catch블럭은 모든 예외 처리(마지막 catch블럭)
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);  // ArithmeticException 에러 발생
//            System.out.println(args[0]); // ArrayIndexOutOfBoundsException 에러 발생
            System.out.println(4);   // 실행 되지 않음
        }catch (ArithmeticException ae){
            if (ae instanceof ArithmeticException)
                ae.printStackTrace();
            System.out.println("예외 메시지 : "+ ae.getMessage());
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException ae) {
            if (ae instanceof ArrayIndexOutOfBoundsException)
                ae.printStackTrace();
            System.out.println("예외 메시지 : "+ae.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(Exception e){   // 모든 예외가 처리됨
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}


