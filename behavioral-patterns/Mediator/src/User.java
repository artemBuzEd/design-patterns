public class User {
    private final String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() { return name; }

    public void receiveMessage(String message, String sender) {
        System.out.println(name + " received from "+ sender + " message: " + message);
    }

    public void sendMessage(String message, String receiver) {
        System.out.println(name + " sends to "+ receiver + " message: " + message);
        chatRoom.sendMessage(message, name, receiver);
    }
}
