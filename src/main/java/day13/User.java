package day13;

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.addNewMessage;

public class User {
    String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        if (!isSubscribed(user)) {
            subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        if (this.isSubscribed(user)) {
            if (user.isSubscribed(this)) {
                return true;
            }
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        addNewMessage(this, user, text);
    }
    public String toString() {
        return username;
    }


}
