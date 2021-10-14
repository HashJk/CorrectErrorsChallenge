package hw.oop;
public class homework 
{
    public static void main (String[]args)
    {
        Human humanServer = new Human();
        Lecturer lecturerServer = new Lecturer();
        Student studentServer = new Student();
        System.out.println("Name: " + humanServer.getName() + "\nAge: " 
                + humanServer.getage()+"\nEmail: "+ lecturerServer.getmail() 
                + "\nStu Number: "+ studentServer.getnumber());
        
        
    }
}
