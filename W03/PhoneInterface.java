public interface PhoneInterface {
    //인터페이스 필드는 앞에 public final static 생략
    //상수
    String SAMSUNG = "삼성전자갤럭시";
    String IPHONE = "아이폰16프로";
    String XIOMI = "샤오미";

    //인터페이스 메소드는 앞에 public abstract void 생략
    //추상메소드
    void sendCall();
    void receiveCall();
    String mp3Play();
    String mp3Stop();
    String getComName();
}
