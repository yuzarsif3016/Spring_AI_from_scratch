interface Demo{
    int add(int a,int b);
}

public class SAMLaunch
{
    public static void main(String[] args)
    {
        Demo d = (a,b) ->  a + b;

      int res =   d.add(10,20);
        System.out.println(res);
        };
    }

