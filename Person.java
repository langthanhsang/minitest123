package minitest;

public class Person {
    private String name;
    private int age;
     static int id;
     private int idhuman;

     public Person(String name, int age, double averageScore) {

     }

    public Person() {
    }

    public Person(String name, int age, int idhuman) {
        this.name = name;
        this.age = age;
        this.idhuman = idhuman;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Person.id = id;
    }

    public int getIdhuman() {
        return idhuman;
    }

    public void setIdhuman(int idhuman) {
        this.idhuman = idhuman;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idhuman=" + idhuman +
                '}';
    }
}
