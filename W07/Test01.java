public class Test01 {

    public static void main(String[] args) {

        //배열의 합 구하기
        //for문 사용
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for(int i = 0; i < numbers.length; i ++) {
            sum += numbers[i];
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + sum / numbers.length);

        sum = 0;
        //for-each문 사용
        for(int value : numbers) {
            sum += value;
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + sum / numbers.length);


        //배열의 역순 구하기
        System.out.println("===배열 역순 출력===");
        for(int i = numbers.length -1; i >= 0; i -- ) {
            System.out.print(numbers[i] + " ");
        }

    }

}
