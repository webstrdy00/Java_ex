package EX7.pkg1;

class Ex7_7 {
    public static void main(String[] args) {
        // 접근 제어자
        // private - 같은 클래스 내에서만 접근이 가능, protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능
        // public - 접근 제한이 전혀 없음
        MyParent p = new MyParent();
//        System.out.println(p.prv);  // 에러
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
public class MyParent{
    private int prv; // 같은 클래스
    int dft;        // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub;  // 접근제한 없음

    public void printMebers(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}


