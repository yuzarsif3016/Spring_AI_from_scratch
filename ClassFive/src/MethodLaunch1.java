class Calc{

    int n1,n2,res;

    public void add(){
        n1 = 10;
        n2 = 20;
      res = n1+n2;
        System.out.println(" add is " + res);

    }

//    public void add(int num1,int num2){
//        res = num1+num2;
//        System.out.println(" add is " + res);
//
//    }

    public int add(int num1,int num2){
        return res = num1+num2;

    }


}

public class MethodLaunch1 {
    public static void main(String[] args) {



        Calc calc = new Calc();

        int res = calc.add(10,20);
        System.out.println("result is " + res);
    }
}
