package Model;

import java.util.Objects;

public class Author {
    private int id ;
    private String name;
    private String first_name;
    private char sex;

    public Author(int id, String name, String first_name, char sex) {
        this.id = id;
        this.name = name;
        this.first_name = first_name;
        this.sex = sex;
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && sex == author.sex && Objects.equals(name, author.name) && Objects.equals(first_name, author.first_name);
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
