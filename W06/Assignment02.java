import java.util.Scanner;

public class Assignment02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("과제 2");
        //사용자가 맞힐 때까지 입력받기
        //이 프로그램은 사용자가 숫자 7을 입력할 때까지 계속해서 숫자를 입력받습니다. 사용자가 7을 입력하면 반복문이 종료되고 정답 메시지를 출력합니다.

        int number = 0;

        while(number != 7) {
            System.out.print("숫자를 입력하세요 : ");
            number = scanner.nextInt();
            System.out.println("입력하신 숫자는 " + number + " 입니다.");
        }

        if(number == 7)
            System.out.println("정답입니다! 프로그램이 종료됩니다.");

        scanner.close();

    }

}
