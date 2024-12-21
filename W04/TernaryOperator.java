import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a와 b를 입력하세요 >> ");
        int a = sc.nextInt();
        int b = sc. nextInt();

        System.out.println("두 수의 차는 " + ((a > b) ? (a - b) : (b - a)));

        sc.close();

    }

}

