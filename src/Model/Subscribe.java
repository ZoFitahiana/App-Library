package Model;

import java.util.Objects;

public class Subscribe extends User{
    private String number;

    public Subscribe(int id, String name, String firstName, String email, char genre, String number) {
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
    public String toString() {
        return "Subscribe{" +
                super.toString() +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Subscribe subscribe = (Subscribe) object;
        return Objects.equals(number, subscribe.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
