package ex004;

public class Freelancer extends Employees{


    public Freelancer(String name,String surname,double salary)
    {
        super(name,surname);
        this.salary = salary / 24;
        
    }
    
}
