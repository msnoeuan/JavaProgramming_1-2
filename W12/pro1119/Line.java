package pro1119;

public class Line extends Shape {

    //draw() 메소드 구현 안 하면 오류남(메소드 오버라이딩으로 구현해야 하기 때문에)
    //오류명 : The type Line must implement the inherited abstract method Shape.draw()

    @Override
    void draw() {
        System.out.println("선을 그립니다.");
    }

}
