
import java.text.DateFormat;
import java.util.*;
public class TimeZone_9 {
    public static void main(String[] args) throws Exception {
        Date today = new Date();
        System.out.println(today);
        Locale local1 = new Locale("en");
        Locale local2 = new Locale("it");
        Locale local3 = new Locale("ru");
        Locale local4 = new Locale("fr");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, local1);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, local2);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, local3);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, local4);

        System.out.println("England Language : "+ df1.format(today));
        System.out.println("Italian Language :  "+ df2.format(today));
        System.out.println("Russia Language :  "+ df3.format(today));
        System.out.println("French Language  : "+ df4.format(today));

    }
}
