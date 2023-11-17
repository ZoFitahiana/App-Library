package Model;

import java.util.Objects;

public class Administrator extends User{
    private String role;
    private String userName;
    private String password;

    public Administrator(int id, String name, String firstName, String email, char genre, String role, String userName, String password) {
        super(id, name, firstName, email, genre);
        this.role = role;
        this.userName = userName;
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "role='" + role + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Administrator that = (Administrator) object;
        return Objects.equals(role, that.role) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, userName, password);
    }
}
