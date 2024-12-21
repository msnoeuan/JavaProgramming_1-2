public class StudentMain {

    public static void main(String[] args) {

        Student st1 = new Student("유승민", 20230880, 22, "010-9976-1563");
        Student st2 = new Student("홍길동", 20247777, 20, "010-1234-5678");

        System.out.println("===학생 1 정보===");
        System.out.println("이름 : " + st1.name);
        System.out.println("학번 : " + st1.stuId);
        System.out.println("나이 : " + st1.age);
        System.out.println("연락처 : " + st1.phone);

        System.out.println();

        System.out.println("===학생 2 정보===");
        System.out.println("이름 : " + st2.name);
        System.out.println("학번 : " + st2.stuId);
        System.out.println("나이 : " + st2.age);
        System.out.println("연락처 : " + st2.phone);

    }

}

