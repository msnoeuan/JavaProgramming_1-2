class AA {

    public AA() {
        System.out.println("생성자 A");
    }

    public AA(int x) {
        System.out.println("매개변수생성자A" + x);
    }

}

class BB extends AA {

    public BB() {
        System.out.println("생성자B");
    }

    public BB(int x) {
        super(x);  //첫 줄에 와야 함
        System.out.println("매개변수생성자B" + x);
    }

}

public class ConstructorEx4 {

    public static void main(String[] args) {

        BB b = new BB(5);

    }

}
