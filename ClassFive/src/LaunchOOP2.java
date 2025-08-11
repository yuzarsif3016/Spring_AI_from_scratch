class Student{

    //instance variables
    int id;
    String name;
    int age;

    void Study(){
        System.out.println("Studying ...");

        int roll_No = 211; // local variable
    }
}

public class LaunchOOP2 {

    public static void main(String[] args) {

        Student student = new Student();

        student.Study();
    }
}
