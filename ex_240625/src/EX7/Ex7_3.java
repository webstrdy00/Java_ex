package EX7;

public class Ex7_3 {
    public static void main(String[] args){
        // Java는 단일상속만을 허용
        // 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 함
        // Object클래스 - 모든 클래스의 조상 
        // 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 됨
        
        // 오버라이딩 - 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
        // 선언부는 변경 불가능, 내용만 변경가능
        // 오버라이딩 조건 - 1. 선언부가 조상 클래스의 메서드와 일치해야 함, 2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없음. 3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없음
        // 오버로딩(overloading) - 기존에 없는 새로운 메서드를 정의하는 것(new), 오버라이딩(overriding) - 상속받은 메서드의 내용을 변경하는 것(change, modifiy)
//        EX7.MyPoint3D p = new EX7.MyPoint3D();
//        p.x = 3;
//        p.y = 5;
//        p.z = 7;
//        System.out.println(p.getLocation());

        Point p = new Point(3, 5);
        System.out.println(p);
    }
}
class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x: " + x+", y: "+y;
    }
    // Object클래스의 toString()을 오버라이딩
    public String toString(){
        return "x:"+x+",y:"+y;
    }
}
class MyPoint3D extends Point{
    int z;

    MyPoint3D(int x, int y, int z) {  // 모든 생성자는 첫줄에 다른 생성자를 호출해야함
        super(x, y); // 첫 줄에 부모 생성자를 호출
        this.z = z;
    }

    // 부모의 getLocation()을 오버라이딩
    String getLocation(){
        return "x: " + x + ", y: " + y + ", z: "+ z;
    }
}


