public class DogMain {

    public static void main(String[] args) {

        Dog dog1 = new Dog("쿠키", "푸들", 3, "갈색");
        Dog dog2 = new Dog("콩이", "말티즈", 2, "검정색");

        System.out.println("===첫 번째 강아지===");
        System.out.println("이름 : " + dog1.name);
        System.out.println("종 : " + dog1.breed);
        System.out.println("나이 : " + dog1.age);
        System.out.println("색깔 : " + dog1.color);

        System.out.println();

        dog1.barking();
        dog1.hungry();
        dog1.sleeping();

        System.out.println();

        System.out.println("===두 번째 강아지===");
        System.out.println("이름 : " + dog2.name);
        System.out.println("종 : " + dog2.breed);
        System.out.println("나이 : " + dog2.age);
        System.out.println("색깔 : " + dog2.color);

        System.out.println();

        dog2.barking();
        dog2.hungry();
        dog2.sleeping();

    }

}
