import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class compare {
    public static void main(String[] args) {
        Comparator<user_5> com = new Comparator<user_5>() {
            @Override
            public int compare(user_5 o1, user_5 o2) {
                int value = o1.score-o2.score;
                if(value==0){
                    return o1.name.compareTo(o2.name);
                }
                else
                    return o1.score-o2.score;
            }
        };
        ArrayList<user_5> Student = new ArrayList<user_5>();
        user_5 s1 = new user_5("A", 75, 19);
        user_5 s2 = new user_5("B", 80, 20);
        user_5 s3 = new user_5("C", 75, 22);
        user_5 s4 = new user_5("D", 76, 18);

        Student.add(s1);
        Student.add(s2);
        Student.add(s3);
        Student.add(s4);
        System.out.println("Before Sorting");
        System.out.println(Student+"\n");

        System.out.println("After Sorting");
        Collections.sort(Student,Collections.reverseOrder(com));
        System.out.println(Student);
    }

    ArrayList<user_5> Student = new ArrayList<user_5>();

    static public class user_5 {
        String name;
        int score;
        int age;

        public user_5(String name, int score, int age) {
            this.name = name;
            this.score = score;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name : " + name + " -> " + "Score : " + score + " Age" + " -> " + age + "\n";
        }
    }
}




