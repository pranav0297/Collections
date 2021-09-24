public class user_5 {
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
