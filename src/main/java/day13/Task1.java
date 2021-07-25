package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "first message sending test");
        user1.sendMessage(user2, "second message sending test");

        user2.sendMessage(user1, "third message sending test");
        user2.sendMessage(user1, "fourth message sending test");
        user2.sendMessage(user1, "fifth message sending test");

        user3.sendMessage(user1, "sixth message sending test");
        user3.sendMessage(user1, "seventh message sending test");
        user3.sendMessage(user1, "eigth message sending test");

        user1.sendMessage(user3, "ninth message sending test");
        user1.sendMessage(user3, "tenth message sending test");
        user1.sendMessage(user3, "eleventh message sending test");

        user3.sendMessage(user1, "twelveth message sending test");

        MessageDatabase.showDialog(user1, user3);
    }
}
