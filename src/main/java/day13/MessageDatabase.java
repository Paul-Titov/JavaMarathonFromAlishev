package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        List<Message> dialog = new LinkedList<>();
        for (Message message : messages) {
            if ((message.receiver == u1 && message.sender == u2) || (message.receiver == u2 && message.sender == u1)) {
                dialog.add(message);
            }
        }
        dialog.forEach((Message m)->System.out.println(m.sender+": "+m.text));
    }
}
