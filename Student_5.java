import java.util.*;
class Student_5{
    public static void main (String[]args){
        List<user_5> student = new ArrayList<user_5>();
        user_5 s1 = new user_5("A", 50, 19);
        user_5 s2 = new user_5("B", 80, 20);
        user_5 s3 = new user_5("C", 75, 22);
        user_5 s4 = new user_5("D", 76, 18);

        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

        System.out.println("Unsorted Data");
        System.out.println(student);

        Collections.sort(student,Collections.reverseOrder(new com2()));

        System.out.println("sorted Data");
        System.out.println(student);
    }


}


