public class Dog {

    String name;
    String breed;
    int age;
    String color;

    Dog() {}
    Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public void barking() {
        System.out.println(name + " 멍멍 짖는다");
    }

    public void hungry() {
        System.out.println(name + " 배고파요");
    }

    public void sleeping() {
        System.out.println(name + " ZZzz....");
    }

}
