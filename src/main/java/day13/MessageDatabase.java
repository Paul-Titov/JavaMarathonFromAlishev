package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        List<Message> dialog = new LinkedList<>();
        for (Message message : messages) {
            if ((message.getReceiver() == u1 && message.getSender() == u2) || (message.getReceiver() == u2 && message.getSender() == u1)) {
                dialog.add(message);
            }
        }
        dialog.forEach((Message m)->System.out.println(m.getSender()+": "+m.getText()));
    }
}
