public class Phone {
    //필드
    private String no;
    private int com;
    private int price;

    //생성자
    Phone(){}
    Phone(String no, int com, int price){
        this.no = no;
        this.com = com;
        this.price = price;
    }

    //메소드(setter / getter / toString)
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public int getCom() {
        return com;
    }
    public void setCom(int com) {
        this.com = com;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Phone [no=" + no + ", com=" + com + ", price=" + price;
    }

}
