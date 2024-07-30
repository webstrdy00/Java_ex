package EX12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        // HashMap <k,v> - 여러 개의 타입 변수가 필요한 경우, 콤마(,)를 구분자로 선언
        HashMap<String, Student> map = new HashMap<>(); // 생성자에 타입지정 생략가능
        map.put("이동", new Student("이동", 1, 1, 100, 100, 100));

        Student s = map.get("이동");

        System.out.println(s.name);
    }
}
class Student{
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}


