import Configuration.ConnectionDB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
      test();
    }
    public static Connection test(){
        ConnectionDB connectionDB = new ConnectionDB();
        try (Connection connection = connectionDB.createConnection()) {
            System.out.println("Connection to the database successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}