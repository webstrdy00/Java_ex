package EX12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.*;

public class Ex12_1 {
    public static void main(String[] args) {
        // 지네릭스(Generics) - 컴파일시 타입을 체크해 주는 기능, 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌
        // 런타임에러보다 컴파일에러가 더 편하기 떄문에 사용
        // 타입 변수 - 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용
//        ArrayList<Integer> list = new ArrayList<Integer>();    // 타입 체크가 강화됨. 지네릭스 덕분
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        Integer u = list.get(2); // 형변환 생략 가능

//        ArrayList<TV> list = new ArrayList<TV>();  // TV타입의 객체만 저장가능
//        list.add(new TV());
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<TV> tvList = new ArrayList<TV>();

        productList.add(new TV());
        productList.add(new Audio());
        
        tvList.add(new TV());
        tvList.add(new TV());
//        tvList.add(new Audio()); // 에러
        
        printAll(productList);
//        printAll(tvList);  // 컴파일 에러 발생

//        TV t = list.get(0);
    }

    private static void printAll(ArrayList<Product> productList) {
        for(Product p : productList)
            System.out.println(p);
    }
}
class Product{}
class TV extends Product{}
class Audio extends Product{}




