package pro1119;

class SamsungPhone implements PhoneInterface {

    //PhoneInterface의 모든 추상 메소드 구현
    @Override
    public void sendCall() {
        System.out.println("갤럭시 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println("갤럭시 전화를 받습니다.");
    }

}

class IPhone implements PhoneInterface {

    @Override
    public void sendCall() {
        System.out.println("아이폰 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println("아이폰 전화를 받습니다.");
    }

}

public class InterfaceEx {

    public static void main(String[] args) {

        SamsungPhone ss1 = new SamsungPhone();
        ss1.sendCall();
        ss1.receiveCall();

        IPhone ip1 = new IPhone();
        ip1.sendCall();
        ip1.receiveCall();

    }

}