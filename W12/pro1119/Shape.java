package pro1119;

public abstract class Shape {

    abstract void draw();  //몸통(중괄호)가 없음
    //abstract 메소드 사용시 클래스 앞에도 abstract 붙이기

}

class Rect extends Shape {

    @Override
    void draw() {
        System.out.println("사각형을 그립니다.");
    }

}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("원을 그립니다.");
    }

}