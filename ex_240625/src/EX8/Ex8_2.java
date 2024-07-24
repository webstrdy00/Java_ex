package EX8;

public class Ex8_2 {
    public static void main(String[] args) {
        // printStackTrace() - 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력
        // getMessage() - 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있음
        // 멀티 catch 블럭 - 내용이 같은 catch 블럭을 하나로 합친 것
        // 조건 - 부모와 자식 관계는 쓸 수 없음
        // 예외 발생시키기 - 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만듬(Exceptin e = new Exception("고의로 발생");)
        // 2. 키워드 throw를 이용해서 예외를 발생 ( throw e;)
//        try {
//            Exception e = new Exception("고의로 발생");
//            throw e;
//        }catch (Exception e){
//            System.out.println("에러 메시지: "+ e.getMessage());
//            e.printStackTrace();
//        }
        // checked 예외 - 컴파일러가 예외 처리 여부를 체크(예외 처리 필수), Exception 자손들
        // unchecked 예외 - 컴파일러가 예외 처리 여부를 체크 안함(예외 처리 선택), RuntimeExceptin 자손들
        try {  // Exception과 그 자손은 반드시 예외처리를 해줘야 함(필수)
            throw new Exception();   // Exception 고의로 발생
        }catch (Exception e){}
        // RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 됨(선택)
        throw new RuntimeException();
    }
}


