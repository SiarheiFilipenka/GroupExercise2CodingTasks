package GroupExercise2.Task07;

public class MarksTester {
    public static void main(String[] args) {

        A a = new A(50, 68, 75);
        B b = new B(80, 85, 75, 93);

        System.out.println("Average percentage of student A marks is: " + a.getPercentage());
        System.out.println("Average percentage of student B marks is: " + b.getPercentage());
    }
}