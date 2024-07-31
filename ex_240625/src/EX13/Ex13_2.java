package EX13;

import javax.swing.*;

public class Ex13_2 {
    static long startTime = 0;
    public static void main(String[] args) {
//        ThreadEx11_1 th1 = new ThreadEx11_1();
//        ThreadEx11_2 th2 = new ThreadEx11_2();
//        th1.start();
//        th2.start();
//        startTime = System.currentTimeMillis();
//
//        try {
//            th1.join();
//            th2.join();
//        }catch (InterruptedException e){}
//        System.out.println(System.currentTimeMillis() - startTime);
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println(input);
    }
}
class ThreadEx11_1 extends Thread{
    public void run(){
        for (int i = 0;i<300;i++)
            System.out.print(new String("-"));
    }
}
class ThreadEx11_2 extends Thread{
    public void run(){
        for (int i = 0;i<300;i++)
            System.out.print(new String("|"));
    }
}
class ThreadEx5_1 extends Thread{
    public void run(){
        for (int i = 10;i>0;i--){
            System.out.println(i);
            try {
                sleep(1000);
            }catch (Exception e){

            }
        }
    }
}