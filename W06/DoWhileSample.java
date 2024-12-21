public class DoWhileSample {

    public static void main(String[] args) {

        char ch = 'a';

        do {
            System.out.print(ch + " ");
            ch = (char) (ch + 1);
        } while(ch <= 'z');

    }

}

