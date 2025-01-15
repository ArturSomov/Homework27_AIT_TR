package homework30.exercise2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        UserMessenger messenger = new UserMessenger(new HashMap<>());

        messenger.sendMessage("Hi! How are you?","user1");
        messenger.sendMessage("We have to meet tomorrow at 17:00", "user1");
        messenger.sendMessage("Good day! Have you seen my request?", "user2");

        System.out.println("Messages for user1:");
        for (String message : messenger.receiveMessages("user1")) {
            System.out.println("- " + message);
        }

        System.out.println("Messages for user2:");
        for (String message : messenger.receiveMessages("user2")) {
            System.out.println("- " + message);
        }

        System.out.println("Messages for user3 (no messages):");
        for (String message : messenger.receiveMessages("user3")) {
            System.out.println("- " + message);
    }
    }
}
