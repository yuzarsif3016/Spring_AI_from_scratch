class Wrapper
{
    int x = 10;
    Integer y = x; // autoboxing
    int z = y; // unboxing
}

public class WrapperDemo
{
    public static void main(String[] args) {
        Wrapper w = new Wrapper();

        System.out.println(w.z);
    }
}
