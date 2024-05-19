package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Statement statement;
    Connection connection;
    public  Con(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingSystem","root","root");
            statement = connection.createStatement();
            System.out.println("Connection created");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
