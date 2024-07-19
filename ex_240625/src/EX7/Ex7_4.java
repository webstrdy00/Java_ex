package EX7;

public class Ex7_4 {
    public static void main(String[] args) {
        // super - 객체 자신을 가리키는 참조변수, 인스턴스 메서드(생성자)내에만 존재(static메서드내에 사용불가)
        // 부모의 멤버를 자신의 멤버와 구별할 대 사용
        // this - iv와 lv를 구분할떄 사용, super - 부모멤버와 자신멤버 구별할떄 사용
        // super() - 조상의 생성자
        // 자식 클래스는 자신이 선언한 것만 초기화해야함, 부모 클래스에서 선언한 것은 super()를 통해 초기화
        // 생성자의 첫 줄에 반드시 생성자를 호출해야 함, 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super()를 삽입
    }
}


