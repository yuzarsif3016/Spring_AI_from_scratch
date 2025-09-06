class Telusko
{
    public void courses(String... courses)
    {
        for(String course : courses){
            System.out.println("Name of the course is : " + course);

        }
    }
}

 class LaunchVarArgs
{
    public static void main(String[] args) {
        Telusko t = new Telusko();
        t.courses("DevOps With AWS","Java SpringBoot");
    }
}
