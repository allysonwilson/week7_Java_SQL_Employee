package example.codeclan.com.employee_starter;

/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");

        department1.save();
        department2.save();

        Employee employee1 = new Employee("Suzie Smith", 45000, department1);
        Employee employee2 = new Employee("Jamie Jones", 25000, department2);

        employee1.save();
        employee2.save();


    }
}
