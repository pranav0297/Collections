public class user_4 {
    String name;
    int age;
    int salary;

    public user_4(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name : " + name + " -> " + "Age : " + age + " Salary" + " -> " + salary + "\n";
    }
}
