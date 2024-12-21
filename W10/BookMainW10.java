public class BookMainW10 {

    public static void main(String[] args) {

        BookW10 littlePrince = new BookW10("어린왕자", "생텍쥐테리");
        littlePrince.show();

        BookW10 loveStory = new BookW10("춘향전");
        loveStory.show();

        BookW10 emptyBook = new BookW10();
        emptyBook.show();

        BookW10 no1 = new BookW10("놀부전");
        no1.show();

    }

}
