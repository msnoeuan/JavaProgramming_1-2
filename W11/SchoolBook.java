class TextBook extends BookW11 {

    String hakgi;
    String school;

    TextBook(){}
    TextBook(String title, int pages, String author, String hakgi, String school){
        super(title, pages, author);
        this.hakgi = hakgi;
        this.school = school;
    }

    void TextBook() {
        super.showBook();
        System.out.println("학년학기 : " + hakgi);
        System.out.println("초중고대 : " + school);
    }

}

public class SchoolBook {

    public static void main(String[] args) {

        TextBook book1 = new TextBook("자바프로그래밍", 100, "황기태", "1학년1학기", "동양미래대학교");
        book1.TextBook();
        TextBook book2 = new TextBook("국어", 40, "선생님", "3학년2학기", "서울초등학교");
        book2.TextBook();

    }

}
