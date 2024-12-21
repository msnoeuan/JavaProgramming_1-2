import java.util.*;

public class CollEx {

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("코난");
        arrList.add("터미네이터");
        arrList.add("글래디에이터");
        arrList.add("아바타");
        arrList.add("스타워즈");

        //정렬
        Collections.sort(arrList);
        for(String movie : arrList) {
            System.out.print(movie + "->");
        }

        System.out.println();

        //거꾸로 정렬
        Collections.reverse(arrList);
        for(int i = 0; i < arrList.size(); i ++) {
            System.out.print(arrList .get(i) + "->");
        }
        System.out.println();

    }

}
