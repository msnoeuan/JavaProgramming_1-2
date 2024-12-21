public class CircleMain {

    public static void main(String[] args) {

        int i;

        //객체 1
        Circle pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + " 면적 = " + area);

        Circle pizza2 = new Circle(5, "불고기피자");
        area = pizza2.getArea();
        System.out.println(pizza2.name + " 면적 = " + area);

        //객체 2
        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + " 면적 = " + area);

        Circle donut2 = new Circle(4, "초코도넛");
        area = donut2.getArea();
        System.out.println(donut2.name + " 면적 = " + area);

        //객체 3
        Circle clock = new Circle();
        clock.radius = 5;
        clock.name = "자바시계";
        area = clock.getArea();
        System.out.println(clock.name + " 면적 = " + area);

    }

}
