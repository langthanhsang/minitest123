package minitest;

import student.Student;

import java.util.ArrayList;

public interface Manager {

    void displayStudent(int n);

    void displayStudent();
    void addStudent();

    void addStudent(ArrayList<Student> arr);

    void  sesrchStudent();

    void sesrchStudent(ArrayList<Student> arr);

    void deleteStudent();
    void editStudent();
    void sortStudent();
    void totalPoint();

    }


