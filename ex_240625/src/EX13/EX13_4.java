package EX13;

import javax.swing.*;

public class EX13_4 {
    public static void main(String[] args) throws Exception{
        // 데몬 쓰레드 - 일반 쓰레드의 작업을 돕는 보조적인 역할 수행
        // 가비지 컬렉터, 자동저장, 화면 자동갱싱 등에 사용
        // sleep() - 예외 처리해야함(InterruptedException), 특정 쓰레드에 사용 불가
        // join(), yield()- 남은 시간을 다음 쓰레드에게 양보하고, 자신은 실행대기함
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();
        System.out.println(th1.isInterrupted());
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 "+ input+"입니다.");
        th1.interrupt();  // interrupt()를 호출하면, interrupted 상태가 true가 됨
//        System.out.println(th1.isInterrupted());   // true
//        System.out.println(th1.isInterrupted());  // true
//        // 메인 thread에 interrupt되었는지 확인하는 코드
//        System.out.println(Thread.interrupted());   // false
    }
}
class ThreadEx9_1 extends Thread{
    public void run(){
        int i = 10;

        while (i != 0 && !isInterrupted()){
            System.out.println(i--);
            for (long x =0;x<2500000000L;x++);
        }

        System.out.println(Thread.interrupted());  // true
        System.out.println(Thread.interrupted());   // false, 상태변수를 false로 초기화함

        System.out.println("카운트가 종료되었습니다.");
    }
}