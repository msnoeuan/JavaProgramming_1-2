public class SmartPhone extends Phone implements PhoneInterface {
    //필드
    private int memsize;
    private boolean internet;

    //생성자
    SmartPhone(){}
    SmartPhone(String no, int com, int price, int memsize, boolean internet){
        super(no, com, price);
        this.memsize = memsize;
        this.internet = internet;
    }

    //메소드(setter / getter / toString)
    public int getMemsize() {
        return memsize;
    }
    public void setMemsize(int memsize) {
        this.memsize = memsize;
    }
    public boolean isInternet() {
        return internet;
    }
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    @Override
    public String toString() {
        return super.toString() + ", memsize=" + memsize + ", internet=" + internet + "]";
    }

    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다.");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화를 받습니다.");
    }
    @Override
    public String mp3Play() {
        return "음악을 켭니다.";
    }
    @Override
    public String mp3Stop() {
        return "음악을 중단합니다.";
    }
    @Override
    public String getComName() {
        String comName = "";
        if(getCom() == 1000)
            comName = PhoneInterface.SAMSUNG;
        else if(getCom() == 2000)
            comName = PhoneInterface.IPHONE;
        else if(getCom() == 3000)
            comName = PhoneInterface.XIOMI;
        return comName;
    }


}
