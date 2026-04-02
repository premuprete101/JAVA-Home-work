class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Priya", 22);

        p1.display();
        System.out.println();
        p2.display();
    }
}