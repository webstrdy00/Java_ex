package EX7;

public class Ex7_18 {
    public static void main(String[] args) {
//        System.out.println(InstanceInner.CONST);
//        System.out.println(StaticInner.cv);
        Outer2 oc = new Outer2();        // 외부 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 객체 생성 가능
        Outer2.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer2.StaticInner.cv : "+ Outer2.StaticInner.cv);

        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 됨
        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println("si.iv : "+ si.iv);
    }
    class InstanceInner{
        int iv = 100;
//        static int cv = 100;   // 에러! static변수를 선언할 수 없음
        final static int CONST = 100;   // fina static은 상수이므로 허용
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 200;   // static 클래스만 static 멤버를 정의할 수 있음
    }
    public void myMethod(){
        class LocalInner{
            int iv = 300;
//            static int cv = 300;
            final static int CONST = 300;
        }
    }
}
class Outer{
    private int outerIv = 0;
    static int outerCv = 0;
    
    class InstanceInner{
        int iiv = outerIv;    // 1. 외부 클래스의 private멤버도 접근 가능
        int iiv2 = outerCv;
    }
    void method(){
        int lv = 0;
        final int LV =0;
        class LocalInner{ // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능
            int liv3 = lv;   // 에러(jdk 1.8부터 가능)
            int liv4 = LV;
        }
    }
}
class Outer2{
    class InstanceInner{
        int iv =100;
    }
    static class StaticInner{
        int iv =200;
        static int cv = 300;
    }
    void myMethod(){
        class LocalInner{
            int iv =400;
        }
    }
}


