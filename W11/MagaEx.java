class BookW11 {

    private String title;
    private int pages;
    private String author;

    BookW11() {};
    BookW11(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        System.out.println("==================");

    }

    void showBook() {
        System.out.println("제목 : " + title);
        System.out.println("페이지수 : " + pages);
        System.out.println("저자 : " + author);
    }

}

class Magazine  extends BookW11 {

    private String date;

    Magazine() {};
    Magazine(String title, int pages, String author, String date) {
        super(title, pages, author);
        this.date = date;
    }

    void showMag() {
        super.showBook();
        System.out.println("발매일 : " + date);
    }

}

public class MagaEx {

    public static void main(String[] args) {

        Magazine ma1 = new Magazine("1번잡지", 100, "승민", "10월11일");
        ma1.showMag();
        Magazine ma2 = new Magazine("2번잡지", 230, "길동", "6월8일");
        ma2.showMag();

    }

}

