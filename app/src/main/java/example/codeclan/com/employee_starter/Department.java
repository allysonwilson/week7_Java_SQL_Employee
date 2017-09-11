package example.codeclan.com.employee_starter;

/**
 * Created by user on 30/08/2017.
 */

import java.sql.ResultSet;

import db.SqlRunner;

public class Department {
    private int id;
    private String title;

    public Department(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void save() {
        String sql = String.format("INSERT INTO artists (name) VALUES ('%s); ", title);
        this.id = SqlRunner.executeUpdate(sql);
        SqlRunner.closeConnection();
    }

    public static void all(){
        String sql = "SELECT * FROM departments;";
        ResultSet rs = SqlRunner.executeQuery(sql);
        try{
            while( rs.next() ){
                String title = rs.getTitle("title");
                System.out.println(title);
            }
        } catch (Exception e){
            system.err.println(e.getClass().getTitle() + " : " + e.getMessage() );
            System.exit(0);
        }finally{
            SqlRunner.closeConnection();
        }
    }

    public static void
}



