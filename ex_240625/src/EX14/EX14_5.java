package EX14;

import java.util.function.Function;

public class EX14_5 {
    public static void main(String[] args) {
        // 메서드 참조
        Function<Integer, MyClass> f = MyClass::new;

        MyClass ms = f.apply(10);
        System.out.println(ms.iv);
        System.out.println(f.apply(20).iv);

        Function<Integer, int[]> f1 = int[]::new;

        int[] results = f1.apply(5);
        System.out.println(results.length);
        System.out.println(f1.apply(100).length);
    }
}
class MyClass{
    int iv;

    MyClass(int iv){
        this.iv = iv;
    }
}

