package Model;

import java.util.Objects;

public class Author {
    private int id ;
    private String name;
    private String first_name;
    private String sex;

    public Author(int id, String name, String first_name, String sex) {
        this.id = id;
        this.name = name;
        this.first_name = first_name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && Objects.equals(name, author.name) && Objects.equals(first_name, author.first_name) && Objects.equals(sex, author.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, first_name, sex);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
