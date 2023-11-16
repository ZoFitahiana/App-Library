package Model;

import java.util.Objects;

public class User {
    private int id ;
    private String name;
    private String firstName;
    private String email ;
    private char genre ;

    public User(int id, String name, String firstName, String email, char genre) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
