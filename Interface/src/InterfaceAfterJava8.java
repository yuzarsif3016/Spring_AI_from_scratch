interface iCalc
{
    default void show()
    {
        telusko();
        System.out.println("default show from interface ");
    }

    //will not inherited in implemented classes
    static void alien()
    {
        System.out.println("Alien of interface");
    }

    //internal method can use in same interface
    private void telusko(){
        System.out.println("used in same interface");
    }

}

class MyCalc4 implements iCalc
{
//    public void show(){
//        System.out.println("Overriden show ");
//    }
}

public class InterfaceAfterJava8
{
    public static void main(String[] args)
    {
        iCalc o = new MyCalc4();
        o.show();

        iCalc.alien(); // static method of interface

    }
}
