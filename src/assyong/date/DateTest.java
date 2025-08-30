package assyong.date;

import java.util.*;
public class DateTest {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DATE);
        System.out.println(year + "년 " + month +"월 " + day +"일");
    }
}
