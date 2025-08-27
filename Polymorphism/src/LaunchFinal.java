class Human{
    public void cry(){
        System.out.println("Humans cry a lot ");
    }


}

class Employee extends Human{
    public void cry(){
        System.out.println("Employees cry more ");
    }
}

public class LaunchFinal {
    public static void main(String[] args)
    {

        Human human = new Employee();
        human.cry();
    }
}
