class Point {

    //디폴트 접근지정자(같은 패키지 안에서 사용 가능)
    //1. 속성, 변수
    protected int x, y;  //한 점을 구성하는 x, y 좌표

    //2. 생성자
    Point() {};
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //3. 메소드
    void set(int x, int y) {
        this.x = x; this.y = y;
    }

    public void showPoint() {  //점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }

}

class ColorPoint extends Point {

    //1. 속성
    private String color;  //점의 색

    //2. 생성자
    ColorPoint() {};
    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    };

    //3. 메소드
    void setColor(String color) {
        this.color = color;
    }

    void showColorPoint() {  //컬러 점의 좌표 출력
        System.out.print(color);
        showPoint();
    }

}

public class ColorPointEx {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.set(1, 2);  //Point 클래스의 set() 호출
        p1.showPoint();

        ColorPoint cp1 = new ColorPoint();  //ColorPoint 객체
        //cp1.x = 3;
        //cp1.y = 3;
        cp1.set(3, 4);  //Point의 set() 호출
        cp1.setColor("빨간색");  //ColorPoint의 setColor() 호출
        cp1.showColorPoint();  //컬러와 좌표 출력

        ColorPoint cp2 = new ColorPoint(5, 6, "파란색");
        cp2.showColorPoint();

    }

}
