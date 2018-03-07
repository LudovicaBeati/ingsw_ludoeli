package db_connect;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static final String USERNAME = "root";

    
    private static final String PASSWORD = "Monali2009!";

    
    private static final String URL = "jdbc:mysql://localhost:3306/login";

    public static void main(String[] args){
        Connection connection;
        
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if(connection != null){
                System.out.println("Connessione riuscita");
            }
        }catch(Exception e){
            System.out.println("Connessione fallita");
        }
    }
}