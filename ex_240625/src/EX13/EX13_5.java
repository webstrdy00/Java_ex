package EX13;

public class EX13_5 {
    public static void main(String[] args) {
        // 쓰레드 동기화 - 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하게 막는 것
        // synchronized - 1. 메서드 전체를 임계 영역으로 지정( public synchronized void 이름(){}), 2. 특정한 영역을 임계 영역으로 지정( synchronized(객체의 참조변수) )
        RunnableEx22 r = new RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }
}
class Account2{
    private int balance = 1000;
    public int getBalance(){
        return balance;
    }

    public synchronized void withdraw(int money){    //
        if (balance >= money){
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){ }
            balance -= money;
        }
    }
}
class RunnableEx22 implements Runnable{
    Account2 acc = new Account2();
    @Override
    public void run() {
        while (acc.getBalance() > 0){
            int money = (int) (Math.random()*3 +1) * 100;
            acc.withdraw(money);
            System.out.println(acc.getBalance());
        }
    }
}
