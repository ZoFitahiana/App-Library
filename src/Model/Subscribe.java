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
}
