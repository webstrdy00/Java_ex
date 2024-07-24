package EX7;

public class Ex7_13 {
    public static void main(String[] args) {
        // 추상 클래스(abstract class) - 미완성 설계도, 미완성 메서드(구현부 {}가 없는 메서드)를 갖고 있는 클래스( abstract 리턴타입 메서드이름();)
        // 다른 클래스 작성에 도움을 주기 위한 것, 인스턴스 생성 불가
        // 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능
        // 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
        // 추상클래스의 작성 - 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존클래스의 공통부분을 뽑아서 추상클래스를 만듬
        // 추상화된 코드는 구체화된 코드보다 유연함(변경에 유리)
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}
abstract class Player{   // 추상 클래스
    abstract void play(int pos);  // 추상 메서드
    abstract void stop();  // 추상 메서드
}
class AudioPlayer extends Player{

    @Override
    void play(int pos) {
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}


