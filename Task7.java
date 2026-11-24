import java.lang.Override;

class Employee{
    double  baseSalary;
    double calculateSalary(){
        return baseSalary;
    }
}
class SalesEmployee extends Employee{
    double bonus;
    @Override
    double calculateSalary(){
        double withbonus = super.calculateSalary() + bonus;
        return withbonus;
    }
}

public class Task7 {
    public static void main(String[] args) {
        SalesEmployee salse = new SalesEmployee();
        salse.baseSalary = 10000.00;
        salse.bonus = 2000.00;
        double total_salse = salse.calculateSalary();
        System.out.println("Total Salse of this Month is : "+total_salse);
    }
}
