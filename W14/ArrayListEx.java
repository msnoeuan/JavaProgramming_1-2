import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        //정수 값만 다루는 ArrayList 생성
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(5);
        arr.add(4);
        arr.add(-1);

        arr.add(2,100);  //4와 -1 사이에 정수 100 삽입

        System.out.println("벡터 내의 요소 객체 수 : " + arr.size());
        //System.out.println("벡터의 현재 용량 : " + al.capacity());
        //Vector에서만 capacity() 메소드 사용 가능

        //모든 요소 정수 출력하기
        for(int i = 0; i < arr.size(); i ++) {
            int n = arr.get(i);
            System.out.println(n);
        }

        //벡터 속의 모든 정수 더하기
        int sum = 0;
        for(int i = 0; i < arr.size(); i ++) {
            //int n = arr.elementAt(i);
            int n = arr.get(i);  //벡터의 i번째 정수
            sum += n;
        }

        System.out.println("벡터에 있는 정수 합 : " + sum);

    }

}
