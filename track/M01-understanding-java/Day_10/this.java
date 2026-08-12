
class Student {

    String name;
    int age;
    double height;

    void input1() {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }
}

class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input1("Raja", 18, 5.8);
        s1.display();
    }
}
