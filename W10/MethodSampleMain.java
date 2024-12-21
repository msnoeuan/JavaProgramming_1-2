public class MethodSampleMain {

    public static void main(String[] args) {

        MethodSample a = new MethodSample();

        int gap1 = a.getSum(1, 2);
        int gap2 = a.getSum(1, 2, 3);
        double gap3 = a.getSum(1.1, 2.2);

        System.out.println("gap1 = " + gap1 + " / gap2 = " + gap2 + " / gap3 = " + gap3);

    }

}
