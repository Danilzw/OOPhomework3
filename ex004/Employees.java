package ex004;

public class Employees {

    private String name;
    private String surName;
    protected double salary;

    public Employees(String name,String surName,double salary)
    {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public Employees(String name,String surName)
    {
        this.name = name;
        this.surName = surName;
    }

    public double getSalary() {
        return salary;
    }


    public String toString()
    {
        return String.format("%s %s - %.02f",name,surName,salary);
    }

    
}
