class Demo1{
    int a,b;

    public Demo1(){
        System.out.println("Zero param of demo 1");
        a = 10;
        b = 20;

    }

    public Demo1(int a,int b){
        System.out.println("Param ctor demo1");
        this.a =a;
        this.b =b;
    }
}

class Demo2 extends Demo1{
    int m,n;

    public Demo2(){
        System.out.println("Zero param demo 2");
        n=3;
        m=33;
    }

    public Demo2(int x,int y){
        System.out.println("param ctor demo2");
        m=x;
        n=y;
    }

    public void display(){
        System.out.println("value of a : " +a);
        System.out.println("value of b : " +b);
        System.out.println("value of m : " +m);
        System.out.println("value of n : " +n);

    }
}

public class LaunchInheritanceCtor {
    public static void main(String[] args) {

        //   Demo2 d2 = new Demo2();
        //   Zero param of demo 1
        //   Zero param demo 2

//        Demo2 d2 = new Demo2(10,20);
//        Zero param of demo 1 --> because super() na dwe did not written super(10,20)
//        param ctor demo2
//        d2.display();
    }
}
