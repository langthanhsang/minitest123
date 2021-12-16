package minitest;

public class Student extends Person{

    private double average;


    public Student(String name, int age) {
        super(name, age);
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "average=" + average +
                '}';
    }
}
