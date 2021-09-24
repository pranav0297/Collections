import java.util.*;

public class compare implements Comparable<compare> {
    private String name;
    private int score;
    private int age;

    public compare(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public int compareTo(compare o) {

        return this.score - o.score;
    }

    @Override
    public String toString() {
        return "Name : " + name + " -> " + "Score : " + score + " Age" + " -> " + age + "\n";
    }
        public static void main (String[]args){
            compare s1 = new compare("A", 50, 19);
            compare s2 = new compare("B", 80, 20);
            compare s3 = new compare("C", 75, 22);
            compare s4 = new compare("D", 76, 18);

            List<compare> employees = new ArrayList<compare>();
            employees.add(s1);
            employees.add(s2);
            employees.add(s3);
            employees.add(s4);

            System.out.println("Unsorted Data");
            System.out.println(employees);


            Collections.sort(employees,Collections.reverseOrder());

            System.out.println("sorted Data");
            System.out.println(employees);
        }
    }

