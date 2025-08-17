
class Parent{
    public Parent fly(){
        System.out.println("Parent is returned");
        return new Parent();
    }
}

class Child extends Parent{

    public Child fly(){
        System.out.println("Child is returned");
        return new Child();
    }
}


public class InheritanceLaunch {
    public static void main(String[] args) {

        Child c = new Child();
        c.fly();
    }
}
