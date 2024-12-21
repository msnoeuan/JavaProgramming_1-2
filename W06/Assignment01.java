import java.util.Scanner;

public class Assignment01 {

    public static void main(String[] args) {

        System.out.println("과제 1");
        Scanner scanner = new Scanner(System.in);

        System.out.print("원하는 숫자를 입력하세요 : ");

        int num = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= num ; i ++) {
            sum += i;
        }

        System.out.println("1부터 " + num + "까지의 합계 : " + sum);

        scanner.close();
    }

}
