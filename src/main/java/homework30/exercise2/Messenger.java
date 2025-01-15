package homework30.exercise2;

import java.util.List;

public interface Messenger {
    void sendMessage(String message, String userID);
    List<String> receiveMessages(String userID);
}
