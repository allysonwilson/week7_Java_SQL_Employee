package example.codeclan.com.employee_starter;

/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4= new Department("Finance");
        Department department5 = new Department("Admin");

        department1.save();
        department2.save();
        department3.save();
        department4.save();
        department5.save();

        Employee employee1 = new Employee("Suzie Smith", 45000, department1);
        Employee employee2 = new Employee("Jamie Jones", 25000, department2);

        Employee employee3 = new Employee("Allyson Wilson", 45000, department1);
        Employee employee4 = new Employee("Andrew Samtoy", 25000, department2);

        Employee employee5 = new Employee("Michael ", 45000, department1);
        Employee employee6 = new Employee("Kyle", 25000, department2);

        Employee employee7 = new Employee("Heather", 45000, department1);
        Employee employee8 = new Employee("Daniel", 25000, department2);

        employee1.save();
        employee2.save();

        employee3.save();
        employee4.save();

        employee5.save();
        employee6.save();

        employee7.save();
        employee8.save();


    }
}


