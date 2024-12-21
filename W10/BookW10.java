//설계도
public class BookW10 {

    //1. 필드, 변수, 속성
    String title;
    String author;

    //2. 생성자
    public BookW10() {
        this("","");
        System.out.println("생성자 호출됨");
    }

    public BookW10(String title) {
        this(title, "작자미상");
    }

    public BookW10(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //3. 메소드
    void show() {
        System.out.println(title + " " + author);
    }

}
