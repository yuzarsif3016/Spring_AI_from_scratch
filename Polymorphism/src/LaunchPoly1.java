class Animal1
{
    public void eat()
    {
        System.out.println("Animal eats to survive");
    }

    public void sleep()
    {
        System.out.println("Animal sleeps to survive ");
    }
}

class Lion extends Animal1
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
class Deer extends Animal1
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
class Monkey extends Animal1
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

class Forest{
    public void permits(Animal1 animal){
        animal.eat();
        animal.sleep();
    }
}

public class LaunchPoly1
{
    public static void main(String[] args)
    {
        Lion lion = new Lion();
        Deer deer = new Deer();
        Monkey monkey = new Monkey();

//        lion.eat();
//        lion.sleep();
//
//        System.out.println("**********************");
//
//        deer.eat();
//        deer.sleep();
//
//        System.out.println("**********************");
//
//        monkey.eat();
//        monkey.sleep();

        Forest forest = new Forest();
        forest.permits(lion);
        forest.permits(deer);
        forest.permits(monkey);


    }
}
