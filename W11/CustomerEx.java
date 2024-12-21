class Customer extends Person {

    private int cusNo;
    private int mile;

    Customer() {};
    Customer(String name, String addr, String phone, int cusNo, int mile) {
        super(name, addr, phone);
        this.cusNo = cusNo;
        this.mile = mile;
    }

    public void printCust() {
        System.out.println("고객번호 : " + cusNo);
        System.out.println("마일리지 : " + mile);
    }

}

public class CustomerEx {

    public static void main(String[] args) {

        Customer cus1 = new Customer("사람이름", "강원도 평창시", "010-5555-6666", 1, 1000);
        cus1.printCust();
        Customer cus2 = new Customer("사람이름2", "충청남도 천안시", "010-7777-7777", 2, 500);
        cus2.printCust();

    }

}
