package Repository;

import Configuration.ConnectionDB;
import Model.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AuthorCrudOperation implements CrudOperations{
    private static Connection connection;
    public static void getConnection() {
        ConnectionDB Db = new ConnectionDB();
        connection = Db.createConnection();
    }
    @Override
    public List findAll() {
        getConnection();
        try {
            String sql = "select * from author";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("List of Auhtor :");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String first_name = resultSet.getString("first_name");
                String sex = resultSet.getString("sex");
                System.out.println(
                        "Author { id : "+id+
                                "name : "+name+
                                "first_name"+first_name+
                                "sex : "+ sex+
                                "};"
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Author> saveAll(List toSave) {
        getConnection();
        try {
            List<Author> author = (List<Author>) toSave;
            for (Author authors:author){
                String sql = "INSERT INTO Author (name, first_name, sex) VALUES (?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1,authors.getName());
                statement.setString(2,authors.getFirst_name());
                statement.setObject(3,authors.getSex());
                int row = statement.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Add list of  Authors successfully !");
        return null;
    }

    @Override
    public Object save(Object toSave) {
        getConnection();
        try{
            Author author = (Author) toSave;
            String sql = "INSERT INTO Author (name, first_name, sex) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,author.getName());
            statement.setString(2, author.getFirst_name());
            statement.setObject(3,author.getSex());
            int row = statement.executeUpdate();
            System.out.println("Add Author successfully !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Object delete(Object toDelete) {
        getConnection();
        try {
            Author author = (Author) toDelete;
            String sql = "delete from author where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,author.getId());
            int row = statement.executeUpdate();
            System.out.println("Deleted Author successfully !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
