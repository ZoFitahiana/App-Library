package Model;

import java.util.Objects;

public class Subscribe extends User{
    private String number;

    public Subscribe(int id, String name, String firstName, String email, String genre, String number) {
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
        Subscribe subcribe = (Subscribe) o;
        return Objects.equals(number, subcribe.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number);
    }

    @Override
    public String toString() {
        return "Subscribe{"+"id="+ getId() + ",name ="+getName()+",firstName="+getfirstName()
        +",email="+getEmail()+",genre="+getGenre()+
                ",number='" + number + '\'' +
                '}';
    }
}
