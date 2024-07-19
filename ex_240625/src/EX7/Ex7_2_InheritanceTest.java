package EX7;

public class Ex7_2_InheritanceTest {
    public static void main(String[] args){
//        EX7.Circle c= new EX7.Circle();
//        c.x =1, c.y =2, c.r = 3;
        Circle c= new Circle();
        c.p.x = 1;
        c.p.y =2;
        c.r = 3;
    }
}
class  MyPoint{
    int x;
    int y;
}
//class EX7.Circle extends EX7.MyPoint{ // 상속
//    int r;
//}
class Circle { //  포함
    MyPoint p = new MyPoint();
    int r;
}


