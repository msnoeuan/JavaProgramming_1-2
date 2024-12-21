public class BookMain {

    public static void main(String[] args) {

        //객체 1
        Book book1 = new Book();
        book1.title = "자바프로그래밍";
        book1.author = "유승민";
        System.out.println(book1.title + ", " + book1.author);

        //객체 2
        Book book2 = new Book("채식주의자", "한강");
        System.out.println(book2.title + ", " + book2.author);

        //객체 3
        Book litPri = new Book("어린왕자", "생텍쥐페리");
        System.out.println(litPri.title + ", " + litPri.author);

    }

}
