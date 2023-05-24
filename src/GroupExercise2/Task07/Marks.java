package GroupExercise2.Task07;

public abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private double subject1Mark;
    private double subject2Mark;
    private double subject3Mark;

    public A(double subject1Mark, double subject2Mark, double subject3Mark) {
        this.subject1Mark = subject1Mark;
        this.subject2Mark = subject2Mark;
        this.subject3Mark = subject3Mark;
    }

    @Override
    public double getPercentage() {
        return (subject1Mark + subject2Mark + subject3Mark) / 3;
    }
}

class B extends Marks {
    private double subject1Mark;
    private double subject2Mark;
    private double subject3Mark;
    private double subject4Mark;

    public B(double subject1Mark, double subject2Mark, double subject3Mark, double subject4Mark) {
        this.subject1Mark = subject1Mark;
        this.subject2Mark = subject2Mark;
        this.subject3Mark = subject3Mark;
        this.subject4Mark = subject4Mark;
    }

    @Override
    public double getPercentage() {
        return (subject1Mark + subject2Mark + subject3Mark + subject4Mark) / 4;
    }
}