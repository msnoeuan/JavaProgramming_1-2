public class Ex3_9 {

    public static void main(String[] args) {

        int numArr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        int i = 0;

        //일반 for문
        for(i = 0; i < numArr.length; i ++) {
            System.out.print(i + " ");
            sum += numArr[i];
        }

        System.out.println("합계 = " + sum);

        //for-each문
        sum = 0;
        for(int item : numArr) {
            System.out.print(item + " ");
            sum += item;
        }
        System.out.println();

        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for(String one : names) {
            System.out.print(one + "\t");
        }
        System.out.println();

        for(i = 0; i < names.length; i ++) {
            System.out.print(names[i] + " ");

        }

    }

}
