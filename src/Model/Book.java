package Model;

import java.sql.Date;
import java.util.Objects;

public class Book {
    private int id;
    private String bookName;
    private int id_author;
    private int page_number;
    private String topic;
    private Date release_date;
    private  String status;

    public Book(int id, String bookName, int id_author, int page_number, String topic, Date release_date, String status) {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuthor() {
        return id_author;
    }

    public void setAuthor(String author) {
        this.id_author = id_author;
    }

    public int getPageNumbres() {
        return page_number;
    }

    public void setPageNumbres(int pageNumbres) {
        this.page_number = pageNumbres;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate(Date releaseDate) {
        this.release_date = releaseDate;
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
        return id == book.id && page_number == book.page_number && Objects.equals(bookName, book.bookName) && Objects.equals(id_author, book.id_author) && Objects.equals(topic, book.topic) && Objects.equals(release_date, book.release_date) && Objects.equals(status, book.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, id_author,page_number, topic, release_date, status);
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
