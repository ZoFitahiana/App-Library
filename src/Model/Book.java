package Model;

import java.sql.Date;
import java.util.Objects;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private int pageNumbres;
    private String topic;
    private Date releaseDate;
    private  String status;

    public Book(int id, String bookName, String author, int pageNumbres, String topic, Date releaseDate, String status) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.pageNumbres = pageNumbres;
        this.topic = topic;
        this.releaseDate = releaseDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumbres() {
        return pageNumbres;
    }

    public void setPageNumbres(int pageNumbres) {
        this.pageNumbres = pageNumbres;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && pageNumbres == book.pageNumbres && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author) && Objects.equals(topic, book.topic) && Objects.equals(releaseDate, book.releaseDate) && Objects.equals(status, book.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, author, pageNumbres, topic, releaseDate, status);
    }
}
