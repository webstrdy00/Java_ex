package EX13;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Ex13_1 {
    public static void main(String[] args) {
        // 프로세스 - 실행 중인 프로그램, 쓰레드 - 프로세스 내에 실제 작업을 수행
        // 멀티쓰레드 장점 - 시스템 자원을 보다 효율적으로 활용, 응답성이 행상, 코드가 간결해짐
        // 단점 - 동기화에 주의, 교착상태가 발생하지 않도록 주의해야 함, 효율적으로 고르게 실행될 수 있게 해야 함
        // 쓰레드 구현과 실행 - 1. Thread 클래스를 상속 2. Runnable인터페이스를 구현
        // 쓰레드 실행 - start()를 호출해야 쓰레드 작업 시작
        // start()로 실행해야 새로운 쓰레드가 생성되고 그 위에 run()이 실행됨
        ThreadEx1_1 t1 = new ThreadEx1_1();
        Thread t2 = new Thread(new ThreadEx1_2());

        t1.start();
        t2.start();
    }
}
class ThreadEx1_1 extends Thread{  // Thread 클래스를 상속받아 구현
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable{   // Runnable 인터페이스를 구현해서 쓰레드 구현

    @Override
    public void run() {
        for (int i = 0;i< 5;i++){
            System.out.println(Thread.currentThread().getName());  // 현재 실행중인 Thread 반환
        }
    }
}