package EX13;

import javax.swing.*;

public class EX13_3 implements Runnable{
    static boolean autoSave = false;
    public static void main(String[] args) {
        // 데몬 쓰레드 - 일반 쓰레드의 작업을 돕는 보조적인 역할 수행
        // 가비지 컬렉터, 자동저장, 화면 자동갱싱 등에 사용
        Thread t = new Thread(new EX13_3());
        t.setDaemon(true);
        t.start();

        for (int i = 0;i<=10;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){ }
            System.out.println(i);
            if (i == 5) autoSave = true;
        }
        System.out.println("프로그램 종료합니다.");
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(3 * 1000);
            }catch (InterruptedException e){ }
            if (autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}
