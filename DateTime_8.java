import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_8 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        SimpleDateFormat formatt = new SimpleDateFormat("dd-MMM-yyyy");
        System.out.println(formatt.format(today));
    }
}
