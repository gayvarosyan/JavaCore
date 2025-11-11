package Homeworks.medicalCenter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final Date GLOBAL_DATE = new Date();
    private static final SimpleDateFormat ONLY_YEAR = new SimpleDateFormat("yyyy");
    private static final SimpleDateFormat ONLY_MONTH = new SimpleDateFormat("MM");
    private static final SimpleDateFormat ONLY_DAY = new SimpleDateFormat("dd");

    static public final SimpleDateFormat DATE_MINUTE = new SimpleDateFormat("dd/MM/yyyy HH:m");
    static public final SimpleDateFormat DATE_YEAR = new SimpleDateFormat("dd/MM/yyyy");

    public static boolean areTheDatesTheSame(Date date1, Date date2) {
        return DATE_YEAR.format(date1).equals(DATE_YEAR.format(date2));
    }

    public static boolean registeredPatientDateChecker(Date date) {
        if (Integer.parseInt(ONLY_YEAR.format(date)) < Integer.parseInt(ONLY_YEAR.format(GLOBAL_DATE))) {
            return false;
        }

        if(Integer.parseInt(ONLY_YEAR.format(date)) >= Integer.parseInt(ONLY_YEAR.format(GLOBAL_DATE))){
            if(Integer.parseInt(ONLY_MONTH.format(date)) < Integer.parseInt(ONLY_MONTH.format(GLOBAL_DATE))){
                return false;
            }
        }

        if(Integer.parseInt(ONLY_YEAR.format(date)) > Integer.parseInt(ONLY_YEAR.format(GLOBAL_DATE))){
            return true;
        }

        if(Integer.parseInt(ONLY_YEAR.format(date)) >= Integer.parseInt(ONLY_YEAR.format(GLOBAL_DATE))){
            if(Integer.parseInt(ONLY_MONTH.format(date)) > Integer.parseInt(ONLY_MONTH.format(GLOBAL_DATE))){
                return true;
            }
        }

        if(Integer.parseInt(ONLY_YEAR.format(date)) >= Integer.parseInt(ONLY_YEAR.format(GLOBAL_DATE))){
            if(Integer.parseInt(ONLY_MONTH.format(date)) >= Integer.parseInt(ONLY_MONTH.format(GLOBAL_DATE))){
                return Integer.parseInt(ONLY_DAY.format(date)) >= Integer.parseInt(ONLY_DAY.format(GLOBAL_DATE));
            }
        }

        return false;
    }

}
