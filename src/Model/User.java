package Model;

public class User extends AddressUser {

    // * Atributos
    private long id;
    private String userName ,name, lastName, email, password;
    private int phoneNum;

    // * Constructor vacío
    public User() {
    }

    // * Constructor
    public User(long id, String userName, String name, String lastName, String email, String password, int phoneNum) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    // * Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    // * toString
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", password="
                + password + ", phoneNum=" + phoneNum + "]";
    }
}
