package overloadingMethods;

import java.util.ArrayList;

public class UserList {

    private ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public void addUser(String name) {
        userList.add(new User(name));
    }

    public void addUser(String name, String surname) {
        userList.add(new User(name, surname));
    }

    @Override
    public String toString() {
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        userList.forEach(user -> sb.append(user.toString()));

        return sb.toString();
    }
}
