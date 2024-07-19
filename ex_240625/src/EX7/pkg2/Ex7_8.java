package EX7.pkg2;

import EX7.pkg1.MyParent;

public class Ex7_8 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv);  // 에러
//        System.out.println(p.dft); // 에러
//        System.out.println(p.prt); // 에러
        System.out.println(p.pub);
    }
}
class MyChild extends MyParent {
    public void printMebers(){
//        System.out.println(prv);  // 에러
//        System.out.println(dft);  // 에러
        System.out.println(prt);
        System.out.println(pub);
    }
}


