package Repository;

import Configuration.ConnectionDB;
import Model.Subscribe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SubscribeCrudOperation implements CrudOperations{
    private static Connection connection;
    public static void getConnection() {
        ConnectionDB Db = new ConnectionDB();
        connection = Db.createConnection();
    }
    @Override
    public List findAll() {
        getConnection();
        try{
            String sql = "select * from subscribe";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("List of subscribe ");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String first_name = resultSet.getString("first_name");
                String email = resultSet.getString("email");
                String genre =  resultSet.getString("genre");
                String number = resultSet.getString("number");

                System.out.println(
                        "Subscrive { id :"+ id
                         +",  name : "+name
                         +", first_name : "+first_name
                         +", email : "+email
                         +", genre : "+genre
                         +", number : "+number
                         +" }:"
                );

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Subscribe> saveAll(List toSave) {
        getConnection();
        try{
            List<Subscribe> subscribe = (List<Subscribe>) toSave;
            for (Subscribe subscribes : subscribe){
                String sql = "INSERT INTO Subscribe(name, first_name, email, genre, number) VALUES(?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, subscribes.getName());
                statement.setString(2,subscribes.getFirstName());
                statement.setString(3, subscribes.getEmail());
                statement.setObject(4,subscribes.getGenre());
                statement.setString(5, subscribes.getNumber());
                int rows = statement.executeUpdate();
            }
            System.out.println("Add list of Subscribe successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Object save(Object toSave) {
        getConnection();
        try{
           Subscribe subscribes = (Subscribe) toSave;
            String sql = "INSERT INTO Subscribe(name, first_name, email, genre, number) VALUES(?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, subscribes.getName());
            statement.setString(2,subscribes.getFirstName());
            statement.setString(3, subscribes.getEmail());
            statement.setObject(4,subscribes.getGenre());
            statement.setString(5, subscribes.getNumber());
            int rows = statement.executeUpdate();
            System.out.println("Add new Subscribe successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Object delete(Object toDelete) {
        getConnection();
        try{
            Subscribe subscribe = (Subscribe) toDelete;
            String sql = "delete from subscribe where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,subscribe.getId());
            int row = statement.executeUpdate();
            System.out.println("Deleted Subscribe successfully !");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
