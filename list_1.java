import java.util.*;

public class list_1 {
    public static void main(String[] args) {
        List <Float> l = new ArrayList<Float>(5);
        l.add(2.5f);
        l.add(3.5f);
        l.add(2.8f);
        l.add(8.0f);
        l.add(12.2f);
        Iterator<Float> i = l.iterator();
        float sum=0;
        while(i.hasNext()){
            sum +=i.next();
        }
        System.out.println("Sum of the float value in the list : "+sum);
    }
}
