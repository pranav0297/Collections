import java.util.Collections;
import java.util.Comparator;
public class com implements Comparator<user_4> {
//    Comparator com = Collections.reverseOrder();
    @Override
    public int compare(user_4 o1, user_4 o2) {
        return o1.salary - o2.salary;
    }
}


