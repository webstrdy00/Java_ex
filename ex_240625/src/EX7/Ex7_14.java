package EX7;

public class Ex7_14 {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for(int i = 0;i< group.length;++i){
            group[i].move(100, 200);
        }
    }
}
abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){/*현재 위치에 정지*/}
}
class Marine extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Marine[x= " + x + ", y = "+y + "]");
    }
    void stimPack(){
        /*스팀팩 사용*/
    }
}
class Tank extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Tank[x= " + x + ", y = "+y + "]");
    }
    void changeMode(){
        /*모드 체인지*/
    }
}
class Dropship extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Dropship[x= " + x + ", y = "+y + "]");
    }
    void load(){
        /*탑승시킴*/
    }
    void deload(){
       /* 하차시킴*/
    }
}

