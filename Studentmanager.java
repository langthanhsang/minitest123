package minitest;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Studentmanager implements Manager {

    ArrayList<Person> personArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Studentmanager() {
    }

    public Person create() {
        System.out.println("human or student");
        System.out.println("1.human");
        System.out.println("2.student");
        int choice = scanner.nextInt();
        String name;
        int age;
        double averageScore;
        Person person = null;
        scanner.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Human name: ");
                name = scanner.nextLine();
                System.out.print("Human age: ");
                age = scanner.nextInt();
                person = new Person();
                break;
            case 2:
                System.out.print("Student name: ");
                name = scanner.nextLine();
                System.out.print("Student age: ");
                age = scanner.nextInt();
                System.out.print("Average Score: ");
                averageScore = scanner.nextDouble();
                person = new Person(name, age, averageScore);
                break;

        }
        return person;
    }

    @Override
    public void display() {
        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }

    @Override
    public void add() {
        personArrayList.add(create());
    }

    @Override
    public void findHuman() {

    }

    @Override
    public void findHuman(int id) {
        boolean check = false;
        for (Person person : personArrayList) {
            if (person.getIdhuman() == id) {
                System.out.println(person);
                check = true;
            }
        }
        if (!check) {
            System.out.println("student not of the list");
        }
    }

    @Override
    public void deteleHuman() {

    }

    @Override
    public void deteleHuman(int id) {

        boolean check = false;
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getIdhuman() == id) {
                personArrayList.remove(i);
                check = true;

            }
        }
        if (!check) {
            System.out.println("studen ont in the list");
        }
        display();
    }


    @Override
    public void editHumanId(int id) {

        boolean check = false;
        for (int i = 0; i < personArrayList.size(); i++) {
            if(personArrayList.get(i).getIdhuman() == id) {
                personArrayList.set(i,create());
                personArrayList.get(i).setIdhuman(id);
                check = true;
                Person.id--;
                break;
            }
        }
        if(!check) {
            System.out.println("student not ont the list");
        }
        display();
    }

    @Override
    public void arrangeListBYAverageScore() {

    }

    @Override
    public double sumOfScore() {
        double sum = 0;
        for (Person person: personArrayList) {
           if ( person instanceof Student) {
               sum += ((Student)person).get
           }
        }
        return 0;
    }
}
