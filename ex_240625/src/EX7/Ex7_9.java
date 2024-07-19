package EX7;

public class Ex7_9 {
    public static void main(String[] args) {
        // 접근 제어자 사용 이유 - 외부로부터 데이터를 보호하기 위해서
        // 캡슐화 - 외부에서 잘못된 접근을 막기위해서 사용(ex -> 변수는 private로 설정해서 외부접근을 막고 메서드에 public으로 설정해서 간접접근을 허용하는 것)
        Time t = new Time();
        t.setHour(2);
        System.out.println(t.getHour());
    }
}
class Time{
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour){
        if(isValidHour(hour))
            return;
        this.hour= hour;
    }
    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour){
        return hour < 0 || hour >23;
    }
    public int getHour(){return hour;}
}

