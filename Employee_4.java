import java.util.*;
    class Employee_4{
    public static void main (String[]args){
        List<user_4> employees = new ArrayList<user_4>();
        user_4 e1 = new user_4("A", 25, 8000);
        user_4 e2 = new user_4("B", 24, 8000);
        user_4 e3 = new user_4("C", 28, 8500);
        user_4 e4 = new user_4("C", 31, 6500);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Unsorted Data");
        System.out.println(employees);

        Collections.sort(employees,Collections.reverseOrder(new com()));

        System.out.println("sorted Data");
        System.out.println(employees);
    }


        }

