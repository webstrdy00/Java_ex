package EX9;

public class Ex9_1 {
    public static void main(String[] args) { 
        // Object 클래스 - 모든 클래스의 최고 조상, 11개의 메서드만 가지고 있음
        // Object obj - 객체 자신(this)과 주어진 객체(obj)를 비교, 같은면 true 다르면 false
        // equals() - 객체의 주소를 비교
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))  // 오버라이딩 안할시 주소를 비교해서 다르고 오버리딩시 값을 비교해서 같다고 나옴
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}
class Value{
    int value;

    Value(int value){
        this.value = value;
    }
    // Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
    public boolean equals(Object obj){    //  오버라이딩 안하면 다르다고 결과가 나옴
        if (!(obj instanceof Value))
            return false;

        Value v = (Value) obj;

        return this.value == v.value;
    }
}



