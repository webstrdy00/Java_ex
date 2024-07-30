package EX12;

enum Direction{EAST, SOUTH, WEST, NORTH}
public class Ex12_5 {
    public static void main(String[] args) {
        // enum(열거형) - 관련된 상수들을 같이 묶어 놓은 것, 값-타입 모두 체크
        // 정의하는 방법 - enum 열거형이름 { 상수명1, 상수명 2,....}
        // 상수 비교에 ==와 compareTo() 사용 가능
        // 열거형에 멤버 추가 - 불연속적인 열거형 상수의 경우. 원하는 값을 괄호()안에 적음, 괄호() 사용하려면, 인스턴스 변수와 생성자를 새로 추가해야함
        // 열거형 생성자는 private 이므로 외부에서 객체생성 불가
        Direction d1 = Direction.EAST;    // 열거형타입.상수이름
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1 == d2);
        System.out.println(d1 == d3);
        System.out.println(d1.equals(d3));
        System.out.println(d1.compareTo(d3));
        System.out.println(d1.compareTo(d2));

        switch (d1){
            case EAST:
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
            default:
                System.out.println("Invalid direction."); break;
        }

        Direction[] dArr = Direction.values();   // 열거형의 모든 상수를 배열로 반환

        for(Direction d: dArr)
            System.out.printf("%s=%d\n", d.name(), d.ordinal());
    }
}


