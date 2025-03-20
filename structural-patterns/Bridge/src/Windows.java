public class Windows implements OperatingSystem {
    @Override
    public void play(String fileName) {
        System.out.println("Playing " + fileName + " on Windows");
    }
}
