public class StudentW13 {

    //1. 속성
    private String name;
    private String stuId;
    private int age;
    private String phone;

    //2. 생성자
    StudentW13() {}
    StudentW13(String name, String stuId, int age, String phone) {
        this.name = name;
        this.stuId = stuId;
        this.age = age;
        this.phone = phone;
    }

    //3. 메소드
    void setName(String name) {
        this.name = name;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return name + ", " + stuId + ", " + age + ", " + phone;
    }

}
