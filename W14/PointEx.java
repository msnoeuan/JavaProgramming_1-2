import java.util.ArrayList;

class PointW14 {

    private int x, y;

    public PointW14() {}  //기본 생성자

    public PointW14(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return ("(" + x + "," + y + ")");
    }

}

public class PointEx {

    public static void main(String[] args) {

        ArrayList<PointW14> arr = new ArrayList<PointW14>();

        //3개의 Point 객체 삽입
        arr.add(new PointW14(2, 3));
        arr.add(new PointW14(-5, 20));
        arr.add(new PointW14(30, -8));

        arr.remove(1);  //인덱스 1의 Point(-5,20) 객체 삭제

        //ArrayList에 있는 Point 객체 모두 검색하여 출력
        for(int i = 0; i < arr.size(); i ++) {
            PointW14 p = arr.get(i);  //ArrayList의 i번째 Point 객체 얻어내기
            System.out.println(p);  //p.toString()을 이용하여 객체 p 출력
        }

    }

}
