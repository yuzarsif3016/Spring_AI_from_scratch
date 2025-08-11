class Dog{
    String name;
    int cost;
    int age;

    public void bark(){
        System.out.println("Barking ....");
    }

    public void sleep(){
        System.out.println("Sleeping ....");
    }
}

public class LaunchOOP1 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sleep();
        dog.bark();
    }
}
