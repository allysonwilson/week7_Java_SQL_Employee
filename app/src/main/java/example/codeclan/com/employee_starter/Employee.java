package example.codeclan.com.employee_starter;
import java.sql.ResultSet;
/**
 * Created by user on 30/08/2017.
 */

import javax.xml.transform.Result;

import db.SqlRunner;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;

    public Employee(String name, double salary, Department department)  {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void save() {
        int departmentId = getDepartment().getId();
        String sql = String.format("INSERT INTO employees (name , salary, department_id ) VALUES " +
                "('%s', %7.2f, %d );", name, salary, departmentId);
        this.id = SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public static void all() {
        String sql = "SELECT * FROM employees;";
        ResultSet rs = SqlRunner.executeQuery(sql);
        try{
            while( rs.next() ){
                String name = rs.getString("name");
                double salary  = rs.getDouble("salary");
                int departmentId = rs.getInt("department_id");
                System.out.println(name);
                System.out.println(salary);
                System.out.println(departmentId);
            }

        }catch( Exception e) {
            System.err.println( e.getClass().getName() + " : " + e.getMessage() );
            System.exit(0);
        }finally{
            SqlRunner.closeConnection();
        }
    }


}
