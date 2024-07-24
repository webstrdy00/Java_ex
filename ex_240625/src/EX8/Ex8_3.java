package EX8;

import java.io.File;
import java.io.IOException;

public class Ex8_3 {
    public static void main(String[] args) {
        // 예외를 처리하는 방법 - try-catch문, 예외 선언하기 
        // 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
        // finally 블럭 - 예외 발생여부와 관계업이 수행되어야 하는 코드를 넣음
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() +"파일이 성공적으로 생성되었습니다.");
        }catch (Exception e){
            System.out.println(e.getMessage() + " 다시 입력해주세요.");
        }
    }

//    static File createFile(String fileName) throws Exception {
//        if (fileName == null || fileName.equals(""))
//            throw new Exception("파일 이름이 유효하지 않습니다.");
//        File f = new File(fileName);    // File 클래스의 객체를 만듬
//        f.createNewFile();
//        return f;  // 생성된 객체의 참조를 반환
//    }
        static File createFile(String fileName) { 
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않습니다.");
        }catch (Exception e){
            fileName = "제목없음.txt";
        }

        File f = new File(fileName);    // File 클래스의 객체를 만듬
         try {
             f.createNewFile();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         return f;  // 생성된 객체의 참조를 반환
    }
}



