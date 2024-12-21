public class StudentW14 {

    private String name;
    private String stuId;
    private int age;
    private String phone;

    StudentW14() {}
    StudentW14(String name, String stuId, int age, String phone) {
        this.name = name;
        this.stuId = stuId;
        this.age = age;
        this.phone = phone;
    }

    String getHoching() {
        if(age < 20) {
            return "어림";
        }
        else if(age >= 20 && age < 30) {
            return "청년";
        }
        else {
            return "선배";
        }
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", stuId=" + stuId + ", age=" + age + ", phone=" + phone + "]";
    }

}
