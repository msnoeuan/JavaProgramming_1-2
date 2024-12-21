import java.util.Calendar;

public class CalendarEx {

    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();
        int yy = now.get(Calendar.YEAR);
        int mm = now.get(Calendar.MONTH) + 1;
        int dd = now.get(Calendar.DAY_OF_MONTH);
        int hh = now.get(Calendar.HOUR_OF_DAY);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);

        System.out.print("현재 시간은 " + yy + "년 " + mm + "월 " + dd + "일 ");
        System.out.println(hh + "시 " + min + "분 " + sec + "초 ");
        System.out.println(now);

    }

}
