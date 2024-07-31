package EX13;

import java.util.ArrayList;

public class EX13_6 {
    public static void main(String[] args) throws Exception{
        // wait(), notify() - 동기화의 효율을 높이기 위해 사용, 동기화 블록 내에서만 사용
        Table table = new Table();

        new Thread(new Cook(table), "Cook").start();
        new Thread(new Customer(table, "dount"), "CUST1").start();    // dount를 먹는 손님
        new Thread(new Customer(table, "burger"), "CUST2").start();   // burger를 먹는 손님

        Thread.sleep(2000);
        System.exit(0);
    }
}
class Customer implements Runnable{
    private Table table;
    private String food;
    Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){ }
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name+" ate a "+food);
        }
    }
}
class Cook implements Runnable{
    private Table table;
    Cook(Table table){
        this.table = table;
    }
    @Override
    public void run() {
        while (true){
            int idx = (int) (Math.random()*table.disNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){ }
        }
    }
}
class Table{
    String[] dishNames = {"dount","dount","burger"};   // dount에 률을 높임
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();
    public synchronized void add(String dish){
        while (dishes.size() >= MAX_FOOD){
            String name = Thread.currentThread().getName();
            System.out.println(name+" is waiting");
            try {
                wait();   // COOK쓰레드를 기다리게 함
                Thread.sleep(500);
            }catch (InterruptedException e){ }
        }
        dishes.add(dish);
        notify();  // 기다리고 있는 CUST를 깨우기 위함
        System.out.println("Dishes:"+dishes.toString());
    }

    public void remove(String dishName){
        synchronized (this){
            String name = Thread.currentThread().getName();

            while (dishes.size() == 0){
                System.out.println(name+" is waiting");
                try {
                    wait();  // CUST 스레드를 기다리게 함
                    Thread.sleep(500);
                }catch (InterruptedException e){ }
            }
            while (true) {
                for (int i = 0;i<dishes.size();i++){
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify(); // 잠자고 잇는 COOK를 꺠우기 위함
                        return;
                    }
                }
                try {
                    System.out.println(name+" is waiting.");
                    wait(); // 원하는 음식이 없는 CUST 쓰레드를 기다리게 함
                    Thread.sleep(500);
                }catch (InterruptedException e){ }
            }
        }
    }
    public int disNum(){return dishNames.length;}
}