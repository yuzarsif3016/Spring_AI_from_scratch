interface Calc{
    void add(int a,int b); // public abstract by default
    int mul();

    void disp();
}

interface Calc2{
    void divide();
}

interface  Calc3 extends Calc2{
    double pi = 3.14;  // by default public static final
}


class Telusko{
    public void alien(){
        System.out.println("Alien is there");
    }
}
//abstract class mycalc implements calc{
//
//}

class myCalc1 extends Telusko implements Calc,Calc2{

    public void add(int a, int b) {
        System.out.println("the result is  " + (a+b));
    }


    public int mul() {
        return 10 * 20;
    }

    public void disp() {
        System.out.println("Display called in calc 1");
    }

    public void divide() {
        int res = 10/2;
        System.out.println(res);
    }
}

class myCalc2 implements Calc{

    public void add(int a, int b) {
        int res  = a + b + 5;
        System.out.println("the result is " + res);
    }

    public int mul() {
        return 10 * 2;
    }

    public void disp() {
        System.out.println("Display called in calc 2");
    }
}

public class LaunchInterface1 {

    public static void main(String[] args) {

        myCalc1 myclac1 = new myCalc1();
        Calc myclac2 = new myCalc2();

        myclac1.disp();
        myclac1.add(10,20);
        int res = myclac1.mul();
        System.out.println(res);
        myclac1.divide();
        myclac1.alien();


        System.out.println("******************");
        myclac2.disp();
        myclac2.add(10,20);

        System.out.println( myclac2.mul());
    }
}
