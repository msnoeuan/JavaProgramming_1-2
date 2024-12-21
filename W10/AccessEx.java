class Sample {

    public int a;
    private int b;
    int c;

}

public class AccessEx {

    public static void main(String[] args) {

        Sample aClass = new Sample();
        aClass.a = 10;
        //aClass.b = 20; -> 오류 발생
        aClass.c = 10;

    }

}
