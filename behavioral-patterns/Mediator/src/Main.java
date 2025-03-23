public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("user1", chatRoom);
        User user2 = new User("user2", chatRoom);
        User user3 = new User("user3", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("hello from user1", "user3");

        user2.sendMessage("hello from user2", "user1");

        user3.sendMessage("hello from user3", "user2");
    }
}