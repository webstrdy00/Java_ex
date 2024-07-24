package EX8;

public class Ex8_5 {
    public static void main(String[] args) {
       // 연결된 예외(chained exception) - 한 예외가 다른 예외를 발생시킬 수 있음
//        Throwable initCause(Throwable cause) - 지정한 예외를 원인 예외로 등록, Throwable getCause() - 원인 예외를 반환
        // 이유 1. 여러 예외를 하나로 묶어서 다루기 위해서, 2. checked예외를 unchecked예외로 변경하려 할 때
        // 이유 1 예시 코드
        // 원래 코드
//        try {
//            install();
//        }catch (SpaceException e){
//            e.printStackTrace();
//        }catch (MemortException e){
//            e.printStackTrace();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        // 변경 코드
//        try {
//            install();
//        }catch (InstallException e){
//            e.printStackTrace();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        // 이유 2 예시 코드
//        static void startInstall() throw SpaceException{
//            if (!enoughSpace())
//                throw new SpaceException("설치할 공간이 부족합니다.");
//            if (!enoughMemory())
//                throw new RuntimeException(new MemoryException("메모리가 부족합니다."));   // Exception 예외를 RuntimeException 예외로 변경
//        } 
    }
//    void intsall() throws InstallException{
//        try {
//            startInstall();     // SpaceException 발생
//            copyFiles();
//        }catch (SpaceException e){
//            InstallException ie = new InstallException("설치중 예외발생");  // 예외 생성
//            ie.initCause(e);   // InstallException의 원인 예외를 SpaceException으로 지정
//            throw ie;     // InstallException을 발생시킴
//        }catch (MemoryException me){
//            // ...
//        }
//    }
}



