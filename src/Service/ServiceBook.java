package Service;

import Repository.BookCrudOperations;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ServiceBook {
    public static void TestCrudBook(){
        BookCrudOperations book = new BookCrudOperations();

        // Save book :
        Model.Book books = new Model.Book(4,"The Boys",1,123, Model.Book.Topic.OTHER, Date.valueOf("2023-01-03"),"emprunt");
        book.save(books);

        // Save list of books :
        List<Model.Book> bookList = new ArrayList<>();
        Model.Book book1 = new Model.Book(5,"The Girl",2,124, Model.Book.Topic.ROMANCE, Date.valueOf("2023-01-02"),"emprunt");
        Model.Book book2 = new Model.Book(6,"Boy or Girl",3,125, Model.Book.Topic.COMEDY, Date.valueOf("2023-01-01"),"emprunt");
        bookList.add(book1);
        bookList.add(book2);
        book.saveAll(bookList);

        //To delete book :
        book.delete(books);

        //List of book :
        book.findAll();


    }
}
