public class CircleArea {

    public static void main(String[] args) {

        final double PI = 3.14;   //원주율을 상수로 선언

        double radius = 10.0;   //원의 반지름
        double circleArea = radius * radius * PI;   //원의 면적 계산

        //원의 면적을 화면에 출력한다.
        System.out.println("원의 면적 = " + circleArea);

        //이름과 학번을 화면에 출력
        String name = "유승민";
        int hb = 20230880;
        char ban = 'C';
        double ki = 120.3;

        System.out.println("이름 : " + name);
        System.out.println("학번 : " + hb);
        System.out.println("반 : " + ban);
        System.out.println("키 : " + ki);

    }

}
