import java.util.Scanner;

public class BookArray {

    public static void main(String[] args) {

        Book[] book1 = new Book[2];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < book1.length; i ++) {
            System.out.print("제목 >> ");
            String title = scanner.nextLine();
            System.out.print("저자 >> ");
            String author = scanner.nextLine();
            book1[i] = new Book(title,author);
        }

        for(int i = 0; i < book1.length; i ++)
            System.out.println("(" + book1[i].title + ", " + book1[i].author + ")");

        scanner.close();

    }

}
