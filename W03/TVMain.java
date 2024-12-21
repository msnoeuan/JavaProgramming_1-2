import java.util.ArrayList;

public class TVMain {

    public static void main(String[] args) {
        ArrayList<SmartTV> arrList = new ArrayList<>();

        arrList.add(new SmartTV(1000, 1500000, 52, "LED", true, false));
        arrList.add(new SmartTV(2000, 900000, 41, "LCD", false, false));
        arrList.add(new SmartTV(3000, 2000000, 64, "LED", true, true));
        arrList.add(new SmartTV(3000, 130000, 52, "OLED", false, true));

        System.out.println("전체 스마트티비 목록");
        for(SmartTV tv : arrList) {
            System.out.println(tv);
        }

    }

}
