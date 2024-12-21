import java.util.ArrayList;

public class SeungminMain {

    public static void main(String[] args) {

        ArrayList<SmartPhone> arrList = new ArrayList<>();
        //== ArrayList<SmartPhone> arrList = new ArrayList<SmartPhone>();

        arrList.add(new SmartPhone("202401", 1000, 1000000, 128, true));
        arrList.add(new SmartPhone("202402", 1000, 1200000, 256, true));
        arrList.add(new SmartPhone("202403", 2000, 1100000, 128, true));
        arrList.add(new SmartPhone("202404", 3000, 900000, 128, true));

        System.out.println(" == 20230880 유승민 == ");
        //전체 스마트폰 목록 (제품번호, 제조사, 가격, 메모리크기, 인터넷여부)
        System.out.println("=====전체 스마트폰 목록=====");
        for(SmartPhone ph : arrList) {
            System.out.println(ph);
        }
        System.out.println();

        //삼성전자 스마트폰 목록(제품번호, 제조사, 가격, 메모리크기)
        System.out.println("=====삼성전자 스마트폰 목록=====");
        for(SmartPhone ph : arrList) {
            if(ph.getCom() == 1000)
                System.out.println(ph.getNo() + ", " + ph.getComName() + ", " +  + ph.getPrice() + ", " +  + ph.getMemsize());
        }
        System.out.println();

        //아이폰 스마트폰 목록(제품번호, 제조사, 가격, 메모리크기)
        System.out.println("=====아이폰 스마트폰 목록=====");
        for(SmartPhone ph : arrList) {
            if(ph.getComName().equals(PhoneInterface.IPHONE))
                System.out.println(ph.getNo() + ", " + ph.getComName() + ", " +  + ph.getPrice() + ", " +  + ph.getMemsize());
        }
        System.out.println();

        //가격 100만원 이상인 스마트폰 목록(제품번호, 제조사, 가격, 메모리크기)
        System.out.println("=====가격이 100만원 이상인 스마트폰 목록=====");
        for(SmartPhone ph : arrList) {
            if(ph.getPrice() >= 1000000)
                System.out.println(ph.getNo() + ", " + ph.getComName() + ", " +  + ph.getPrice() + ", " +  + ph.getMemsize());
        }
        System.out.println();

    }

}
