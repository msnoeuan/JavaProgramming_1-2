package pro1119;

public interface PhoneInterface {

    int TIMEOUT = 10000;  //상수 필드 선언 (자동으로 public static final 붙음)
    void sendCall();  //추상 메소드(자동으로 public abstract 붙음)
    void receiveCall();  //추상 메소드(자동으로 public abstract 붙음)

}


interface MobilePhoneInterface extends PhoneInterface {

    void sendSMS();
    void receiveSMS();

}

interface MP3Interface {

    void play();
    void stop();

}