public class Ex06 {

    public static void main(String[] args) {

        //0 ~ 9 까지 출력하기(10번 반복)
        for(int i = 0; i < 10; i ++) {
            System.out.println("i = " + i);
        }

        //1 ~ 10까지의 합계를 구하시오.
        int iSum = 0;
        for(int i = 1; i <= 10; i ++) {   //이때 i는 지역변수
            iSum += i;
            System.out.println("i = " + i + ", 합계(iSum) = " + iSum);
        }

        System.out.println("==========while 문==========");
        int j = 0;
        while(j < 10) {
            System.out.print(j + " ");
            j ++;

        }
    }

}
