package Model;

import java.sql.Date;
import java.util.Objects;

public class Book {

    public enum Topic {
        COMEDY, ROMANCE, OTHER
    }

    private int id;
    private String bookName;
    private int id_author;
    private int page_number;
    private Topic topic;
    private Date release_date;
    private  String status;

    public Book(int id, String bookName, int id_author, int page_number, Topic topic, Date release_date, String status) {
        this.id = id;
        this.bookName = bookName;
        this.id_author = id_author;
        this.page_number = page_number;
        this.topic = topic;
        this.release_date = release_date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getId_author() {
        return id_author;
    }

    public int getPage_number() {
        return page_number;
    }

    public Topic getTopic() {
        return topic;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && id_author == book.id_author && page_number == book.page_number && Objects.equals(bookName, book.bookName) && topic == book.topic && Objects.equals(release_date, book.release_date) && Objects.equals(status, book.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, id_author, page_number, topic, release_date, status);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", id_author=" + id_author +
                ", pageNumbres=" + release_date+
                ", topic='" + topic + '\'' +
                ", releaseDate=" + release_date+
                ", status='" + status + '\'' +
                '}';
    }
}
