class AndroidCall
{
    public void call()
    {
        System.out.println("New UI which is bad ...");
    }
}

public class AnonymousDemo
{
    public static void main(String[] args)
    {
        new AndroidCall() // anonymous inner class
        {
            public void call()
            {
                System.out.println("My UI which is good ...");
            }

        }.call();

    }
}
