package ex004;

import java.util.Comparator;

// Это кажется самая сложная часть проекта хотелось бы глубже узнать как это работает но принцип понятен
public class EmpComparator implements Comparator<Employees>{
    
    private Sorttype sorttype;

    public EmpComparator(Sorttype sorttype)
    {
        this.sorttype = sorttype;
    }
    
    public int compare(Employees emp1,Employees emp2)
    {
        return sorttype == Sorttype.Ascending?Double.compare(emp1.getSalary(),emp2.getSalary()):
            Double.compare(emp2.getSalary(),emp1.getSalary());
        
    }

    
}
