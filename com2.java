import java.util.Comparator;
public class com2 implements Comparator<user_5> {
    @Override
    public int compare(user_5 s1, user_5 s2) {
        return s1.score - s2.score;
    }

}
