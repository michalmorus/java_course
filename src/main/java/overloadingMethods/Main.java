package overloadingMethods;

public class Main {
    public static void main(String ...args) {
        UserList userList = new UserList();
        User user1 = new User("user 1");
        userList.addUser(user1);
        User user2 = new User("user 2", "asd");
        userList.addUser(user2);

        userList.addUser("user 3");
        userList.addUser("user 4", "dasd");

        System.out.println(userList.toString());
    }
}
