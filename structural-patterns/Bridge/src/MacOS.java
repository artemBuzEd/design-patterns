public class MacOS implements OperatingSystem {
    @Override
    public void play(String fileName) {
        System.out.println("Playing " + fileName + " on MacOS");
    }
}
