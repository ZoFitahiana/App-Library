package Model;

import java.util.Objects;

public class Subcribe extends User{
    private String number;

    public Subcribe(int id, String name, String firstName, String email, String genre, String number) {
        super(id, name, firstName, email, genre);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Subcribe subcribe = (Subcribe) o;
        return Objects.equals(number, subcribe.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number);
    }
}
