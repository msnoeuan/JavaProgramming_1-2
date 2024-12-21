// 설계도, 붕어빵틀
public class Circle {

    // 1. 속성, 특징
    int radius;  //원의 반지름 필드
    String name;  //원의 이름 필드

    // 2. 생성자
    Circle() {}  //원의 생성자1
    Circle(int radius, String name) {  //원의 생성자2
        this.radius = radius;
        this.name = name;
    }

    // 3. 동작, 기능, 메소드
    public double getArea() {  //원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }

}
