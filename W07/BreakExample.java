import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print(">>");
            String text = s.nextLine();
            /*
             * nextLine()과 next()의 차이
             * next() : 스페이스 존재시 띄어쓰기 전까지만 출력
             * nextLine() : 한 줄 모두 출력
             */

            if(text.equals("exit"))  //"exit"이 입력되면 반복 종료
                break;
        }

        System.out.println("종료합니다...");
        s.close();

    }

}
