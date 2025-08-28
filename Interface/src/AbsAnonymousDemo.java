abstract class Phone
{
    abstract void connect();
}

//class MyPhone extends Phone
//{
//
//    void connect()
//    {
//        System.out.println("Calling my best buddy ");
//    }
//}

public class AbsAnonymousDemo
{
    public static void main(String[] args)
    {
        Phone obj = new Phone(){

            public void connect() {
                    System.out.println("Calling my best buddy ");

            }
        };
        obj.connect();

        AnonymousInterface i = new AnonymousInterface() {
            public void connect() {
                System.out.println("Hello from interface anonymous");
            }
        };
        i.connect();
    }
}

interface AnonymousInterface{
    void connect();
}
