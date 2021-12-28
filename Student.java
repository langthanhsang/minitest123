package minitest;

public class Student extends Person {

    private  double averageScore;


    public Student() {

    }

    public Student(double averageScore) {
        super(name, age, averageScore);
        this.averageScore = averageScore;
    }

    public Student(String name, int age, double average) {
        super();
        this.averageScore = average;
    }

    @Override
    public String toString() {
        return "Student{" + 
                "average=" + averageScore +
                '}';
    }
}
