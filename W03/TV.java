public class TV {
    private int com;
    private int price;
    private int size;

    TV() {}
    TV(int com, int price, int size) {
        this.com = com;
        this.price = price;
        this.size = size;
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
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "SmartTV [com=" + com + ", price=" + price + ", size=" + size;
    }

}
