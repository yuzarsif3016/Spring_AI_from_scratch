abstract class Animal2
{
    public abstract void eat();

    public abstract void sleep();

    public void walk(){
        System.out.println("Animal is walking");
    }

}

class Lion2 extends Animal2
{
    public void eat()
    {
        System.out.println("Lion eats to survive");
    }

    public void sleep()
    {
        System.out.println("Lion sleeps to survive ");
    }
}
class Deer2 extends Animal2
{
    public void eat()
    {
        System.out.println("Deer eats to survive");
    }

    public void sleep()
    {
        System.out.println("Deer sleeps to survive ");
    }
}
class Monkey2 extends Animal2
{
    public void eat()
    {
        System.out.println("Monkey eats to survive");
    }

    public void sleep()
    {
        System.out.println("Monkey sleeps to survive ");
    }
}

class Forest2{
    public void permits(Animal2 animal){
        animal.eat();
        animal.sleep();
    }
}

public class LaunchAbstraction {
    public static void main(String[] args) {
        Lion2 lion2 = new Lion2();
        Deer2 deer2 = new Deer2();
        Monkey2 monkey2 = new Monkey2();

        Forest2 forest = new Forest2();
        forest.permits(lion2);
        forest.permits(deer2);
        forest.permits(monkey2);

        lion2.walk(); // concrete method abstract class
    }
}
