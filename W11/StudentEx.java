class Person {

    private String name;
    private String addr;
    private String phone;

    Person(){};
    public Person(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
        System.out.println("========================");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("전화번호 : " + phone);
    }

}

class StudentW11 extends Person {

    private int stuId;
    private String jeongong;

    StudentW11() {};
    public StudentW11(String name, String addr, String phone, int stuId, String jeongong) {
        super(name, addr, phone);
        this.stuId = stuId;
        this.jeongong = jeongong;
        System.out.println("학번 : " + stuId);
        System.out.println("전공 : " + jeongong );

    }
}

public class StudentEx {

    public static void main(String[] args) {

        StudentW11 st1 = new StudentW11("유승민", "서울시 구로구", "010-1111-2222", 20230880, "컴퓨터소프트웨어공학과");
        StudentW11 st2 = new StudentW11("홍길동", "경기도 수원시", "010-3333-4444", 20249999, "컴퓨터정보공학과");

    }

}
