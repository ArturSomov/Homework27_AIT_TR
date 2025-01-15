package homework30.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMessenger implements Messenger {
    private Map<String, List<String>> messageStorage;

    public UserMessenger(Map<String, List<String>> messageStorage) {
        this.messageStorage = messageStorage;
    }

    @Override
    public void sendMessage(String message, String userID) {
        messageStorage.putIfAbsent(userID, new ArrayList<>());
        messageStorage.get(userID).add(message);
        System.out.println("Message is sent to user " + userID + ": " + message);
    }

    @Override
    public List<String> receiveMessages(String userID) {
        return messageStorage.getOrDefault(userID, new ArrayList<>());
    }
}
