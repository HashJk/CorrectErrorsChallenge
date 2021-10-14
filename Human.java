package hw.oop;
public class Human 
{   
    private String Name;
    private int age;

    public Human ()
    {
        Name = no Name;
        age = 1;
    }
    
    public Human (String interdName,int interdage)
    {
        this.Name = interdName;this.age=interdage;
    }
    
    public void setName(String newName) 
    {
        this.Name = newName;
    }
    
    public String getName() 
    {
    return Name;
    }
 
    public int setage(int newage) 
    {
       this.age = newage;
       return age;
    }
    
    public int getage() 
    {
        
    }

    public void reset (String Name,int age)
    {
        setName(Name);
        setage(age);
    }
}

class Student extends Human 
{
   private long number;
   
   public Student()
    {
        number = 1;
    }
   
    public Student(long number)
    {
        super();
        this.number = number;
    }
    
    public void setnumber(long newnumber) 
    {
       this.number = newnumber;
    }
    
    public long getnumber() 
    {
        return number;
    }
}

class Lecturer extends Human 
{
   private String mail ;

    public Lecturer()
    {
        mail = "no Mail";
    }
    
    public Lecturer (String interdmail)
    {
        super();
        this.mail = interdmail;
    }
    
    public void setmail(String newmail) 
    {
        this.mail = newmail;
    }
    
    public String getmail() 
    {
        return mail;
    }
}