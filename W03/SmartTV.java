public class SmartTV extends TV implements TvInterface{
    String type;
    boolean internet;
    boolean blue;

    SmartTV(){}
    SmartTV(int com, int price, int size, String type, boolean internet, boolean blue){
        super(com, price, size);
        this.type = type;
        this.internet = internet;
        this.blue = blue;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isInternet() {
        return internet;
    }
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    public boolean isBlue() {
        return blue;
    }
    public void setBlue(boolean blue) {
        this.blue = blue;
    }
    @Override
    public String toString() {
        return super.toString() + ", type=" + type + ", internet=" + internet + ", blue=" + blue + "]";
    }
    @Override
    public void youtubePlay() {
        System.out.println("유튜브를 재생합니다.");
    }
    @Override
    public void youtubeStop() {
        System.out.println("유튜브를 중지합니다.");
    }
    @Override
    public void internetPlay() {
        System.out.println("인터넷을 연결합니다.");
    }
    @Override
    public void internetStop() {
        System.out.println("인터넷을 정지합니다.");
    }
    @Override
    public String getComName() {
        String comName = "";

        if(getCom() == 1000)
            comName = TvInterface.SAMSUNG;
        else if(getCom() == 2000)
            comName = TvInterface.LG;
        else if(getCom() == 3000)
            comName = TvInterface.XIOMI;
        return comName;
    }



}
