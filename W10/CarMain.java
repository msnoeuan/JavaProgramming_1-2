class Car{

    //1.변수
    int carId;
    String name;

    //2.생성자
    Car() {
        carCount ++;
    }

    Car(int carId, String name) {
        this.carId = carId;
        this.name = name;
        carCount ++;
    }

    //3.메소드
    void show() {
        System.out.println(carId + ", " + name);
    }
    // =================================================
    static int carCount;

    static void print() {
        System.out.println("전체 차 대수 : " + carCount);
    }

}

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car(1, "벤츠");
        Car car2 = new Car(2, "제네시스");
        Car car3 = new Car(3, "테슬라");
        Car car4 = new Car(4, "소렌토");
        Car car5 = new Car();
        car1.show();
        car2.show();
        car3.show();
        car4.show();
        //static
        Car.print();  //클래스이름.메소드이름();
        System.out.println("차 대수 : " + Car.carCount);

    }

}
