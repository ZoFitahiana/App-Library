package Model;

import java.util.Objects;

public class User {
    private String id ;
    private String name;
    private String firstName;
    private String email ;
    private String genre ;


    public User(String id, String name, String firstName, String email, String genre) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(firstName, user.firstName) && Objects.equals(email, user.email) && Objects.equals(genre, user.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firstName, email, genre);
    }
}
