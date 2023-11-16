package Repository;

import Configuration.ConnectionDB;
import Model.Book;
import java.sql.*;
import java.util.List;

public class BookCrudOperations implements CrudOperations {
    private static Connection connection;
    public static void getConnection() {
        ConnectionDB Db = new ConnectionDB();
        connection = Db.createConnection();
    }

    @Override
    public List<Book> findAll() {
        getConnection();
        try {
            String sql = "select * from book";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String book_name = resultSet.getString("book_name");
                int id_author = resultSet.getInt("id_author");
                int page_number = resultSet.getInt("page_number");
                String topic = resultSet.getString("topic");
                Date release_date  = resultSet.getDate("release_date");
                String status = resultSet.getString("status");

                System.out.println(
                        "{ id= "+id
                                +" book_name = "+book_name +
                                ",id_author = "+id_author +
                                ",page_number = "+page_number+
                                ",topic = "+topic+
                                ",release_date = "+release_date+
                                ",status = "+status+" ;}"
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Book> saveAll(List toSave)  {
        getConnection();
       try {
           List<Book> book = (List<Book>) toSave;
           System.out.println("This list of book is added:");
           for (Book books:book){
               String sql = "insert into book (book_name, id_author, page_number, topic, release_date, status) values (?,?,?,?,?,?)";
               PreparedStatement statement = connection.prepareStatement(sql);
               statement.setString(1,books.getBookName());
               statement.setInt(2,books.getId_author());
               statement.setInt(3,books.getPage_number());
               statement.setObject(4, books.getTopic().name(),Types.OTHER);
               statement.setDate(5,books.getRelease_date());
               statement.setString(6,books.getStatus());
               int row= statement.executeUpdate();
               System.out.println(books);
           }

       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
        return null;
    }

    @Override
    public Object save(Object toSave) {
        getConnection();
        try {
            Book books = (Book) toSave;
            String sql = "insert into book (book_name, id_author, page_number, topic, release_date, status) values (?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,books.getBookName());
            statement.setInt(2,books.getId_author());
            statement.setInt(3,books.getPage_number());
            statement.setObject(4, books.getTopic().name(),Types.OTHER);
            statement.setDate(5,books.getRelease_date());
            statement.setString(6,books.getStatus());
            int row= statement.executeUpdate();
            System.out.println("This book is added: ");
            System.out.println(books);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Object delete(Object toDelete) {
        getConnection();
        try {
            Book book = (Book) toDelete;
            String sql = "delete from book where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,book.getId());
            int row = statement.executeUpdate();
            System.out.println("This book is deleted :");
            System.out.println(book);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
