public class StudentMainW13 {

    public static void main(String[] args) {

        StudentW14 st1 = new StudentW14();
        System.out.println(st1);
        //System.out.println(stu1.name + " " + stu1.stuId);
        StudentW13 st2 = new StudentW13("리사", "20240000", 24, "010-1111-2222");
        st2.setName("라리사");
        st2.setPhone("010-3333-3333");
        System.out.println(st2.toString());
        System.out.println(st2);

    }

}
