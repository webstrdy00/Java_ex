package EX11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex11_3 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true){
            System.out.print(">>");
            try {
                // 화면으로부터 라인단위로 입력받음
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine().trim();

                if ("".equals(input))continue;

                if (input.equalsIgnoreCase("q")){
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다. ");
                    System.out.println(" q 또는 Q - 프로그램 종료  ");
                    System.out.println(" help - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);    // 입력받은 명령어를 저장
                    // LinkedList의 내용을 보여줌
                    LinkedList list = (LinkedList) q;

                    for (int i = 0;i<list.size();i++){
                        System.out.println((i+1)+"."+list.get(i));
                    }
                }else {
                    save(input);
                    System.out.println(input);
                }
            }catch (Exception e){
                System.out.println("입력오류입니다.");
            }
        }
    }
    public static void save(String input){
        // queue에 저장
        if (!"".equals(input))
            q.offer(input);
        // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제
        if (q.size() > MAX_SIZE)
            q.remove();
    }
}




