package overloadingMethods;

public class User {

    private String name;
    private String surname;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
