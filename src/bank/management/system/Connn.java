package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            String dbPassword = System.getenv("BANK_DB_PASSWORD");

            if (dbPassword == null || dbPassword.isBlank()) {
                throw new IllegalStateException(
                        "BANK_DB_PASSWORD environment variable is not set"
                );
            }

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem",
                    "root",
                    dbPassword
            );
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
