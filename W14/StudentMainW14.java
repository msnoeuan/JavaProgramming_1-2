import java.util.ArrayList;

public class StudentMainW14 {

    public static void main(String[] args) {

        ArrayList<StudentW14> arrList = new ArrayList<>();
        StudentW14 st1 = new StudentW14("홍길동", "20240001", 20, "010-1111-1111");
        arrList.add(st1);
        arrList.add(new StudentW14("리사", "20230002", 21, "010-2222-2222"));
        arrList.add(new StudentW14("동미래", "1965001", 59, "010-3333-3333"));

        for(StudentW14 one : arrList) {
            System.out.println(one + " ," + one.getHoching());
        }

        for(int i = 0; i < arrList.size(); i ++) {
            System.out.print(arrList.get(i).getName() + " " + arrList.get(i).getStuId() + " ");
            System.out.print(arrList.get(i).getAge() + " " + arrList.get(i).getPhone() + " ");
            System.out.print(arrList.get(i).getHoching() + " ");
        }

    }

}
