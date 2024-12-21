public class WrapperEx {

    public static void main(String[] args) {

        System.out.println(Character.toLowerCase('A'));
        Integer.parseInt("-123");
        Integer ival = Integer.valueOf(100);
        Double dvar = Double.valueOf(3.14);
        Double d2var = Double.parseDouble("3.14");
        System.out.println(dvar + ", " + d2var);
        System.out.println("정수 최대값 " + Integer.MAX_VALUE);
        System.out.println("정수 최소값 " + Integer.MIN_VALUE);

    }

}
