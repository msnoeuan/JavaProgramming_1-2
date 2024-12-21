package pro1119;

class PDA {

    int calc(int x, int y) {
        return x + y;
    }

}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

    @Override
    public void sendCall() {
        System.out.println("갤럭시 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println("갤럭시 전화를 받습니다.");
    }

    @Override
    public void play() {
        System.out.println("음악 연주합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악 중단합니다.");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자갑니다.");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요");
    }

}

public class InterfaceEx1 {

    public static void main(String[] args) {

        SmartPhone smph1 = new SmartPhone();
        smph1.sendCall();
        smph1.receiveCall();
        smph1.play();
        smph1.stop();
        smph1.calc(2, 3);
        smph1.sendSMS();
        smph1.receiveSMS();

    }

}
