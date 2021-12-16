package minitest;

import student.Student;

import java.util.ArrayList;

public class Studentmanager implements Manager {

    ArrayList<Student> arrStudent = new ArrayList<>();

    @Override
    public void displayStudent(int n) {

        for (int i = 0; i <= n; i++) {
            Student student = new Student();
            student.inputInfo();
            arrStudent.add(student);
        }

        }

    @Override
    public void displayStudent() {

    }

    @Override
    public void addStudent() {

    }


    @Override
    public void addStudent(ArrayList<Student> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).displayStudent();
        }

    }

    @Override
    public void sesrchStudent() {

    }

    @Override
    public void sesrchStudent(ArrayList<Student> arr) {
        int check = 0;
        for (int i = 0; i < arr.size(); i++) {
            String name=null;
            if(arr.get(i).getName().equals(name)) {
                arr.get(i).toString();
                check=1;
            }
        }
        if(check == 0) {
            System.out.println("không có sinh viên cần tìm");
        }


    }

    @Override
    public void deleteStudent() {



    }

    @Override
    public void editStudent() {

    }

    @Override
    public void sortStudent() {

    }

    @Override
    public void totalPoint() {

    }
}
