package day21_dateTime_varargs;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts);//2023-04-25T20:39:32.019418200

        //tarih ve saati su şekilde yazdırın 25/24/2023 11:04

        System.out.println(ts.getDayOfMonth()+"/"+ts.getMonthValue()+"/"+
                ts.getYear()+" "+ts.getHour()+":"+ts.getMinute());//25/4/2023 20:46

        System.out.println(ts.plusHours(100));//2023-04-30T00:47:20.610244100



    }
}
