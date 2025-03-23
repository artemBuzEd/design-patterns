import java.util.HashMap;
import java.util.Map;

public class ChatRoom {
    private Map<String, User> users  = new HashMap <String, User>();

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    public void sendMessage(String message, String sender, String receiver) {
        if(users.containsKey(receiver)) {
            users.get(receiver).receiveMessage(message, sender);
        } else {
            System.out.println("User " + receiver + " not found in chat room");
        }
    }
}
