package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
    static DateFormat df = new SimpleDateFormat("MMddHm");

    public static String getCurrentDateTime() {
        return "-" + df.format(new Date());
    }

}
