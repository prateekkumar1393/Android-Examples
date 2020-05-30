package prateek.gds.roomexample.util;

import java.util.Calendar;
import java.util.Date;

public class AppUtils {
    public static Date getCurrentDateTime(){
        Date currentDate =  Calendar.getInstance().getTime();
        return currentDate;
    }

    public static int toInt(String number){
        try{
            return Integer.parseInt(number);
        } catch (NumberFormatException e){
            return 0;
        }
    }
}
