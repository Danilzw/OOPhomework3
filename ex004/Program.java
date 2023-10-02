package ex004;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Program
{
    static Random random = new Random(0);


    static Employees [] getWorkers(int count)
    {
        Employees [] workers = new Employees[count];
        String [] names = {"Аркадий","Сергей","Владимир","Матвей","Данил","Евгений"};
        String [] surnames = {"Маслов","Мавлетов","Петров","Лазарев","Степанов","Смирнов"};

        int randomsalary = random.nextInt(2000 - 200 + 1);
        // Тут я решил заполнять массивы в случайном порядке Фрилансеров и Воркеров


        // Employees worker = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], randomsalary);
        // Employees freelancer = new Freelancer(names[random.nextInt(names.length)],surnames[random.nextInt(surnames.length)],randomsalary);

        for(int i=0;i<count;i++)
        {
            if(random.nextBoolean())
            {
                workers[i] = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], randomsalary);
            }
            else{
                workers[i] = new Freelancer(names[random.nextInt(names.length)],surnames[random.nextInt(surnames.length)],randomsalary);
            }
        }

        return workers;
    }

    public static void main(String[] args) {
        
       Employees [] employees = getWorkers(10);
    // Можно было еще сделать так:
    //    EmpComparator comparator = new EmpComparator(Sorttype.Descending);


    // Здесь все понятно,изначально конструировал без age поэтом нет ее реализации но это не сложнее чем то что я сделал
       Arrays.sort(employees,new EmpComparator(Sorttype.Descending));

       for(Employees employee : employees)
       {
        System.out.println(employee);
       }
    }
}