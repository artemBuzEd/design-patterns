public class Main {
    public static void main(String[] args) {
        File file1 = new File("document.txt", 50);
        File file2 = new File("photo.jpg", 200);
        File file3 = new File("video.mp4", 1000);

        Folder rootFolder = new Folder("Root");
        Folder imagesFolder = new Folder("Images");
        Folder videosFolder = new Folder("Videos");

        rootFolder.addComponent(file1);
        imagesFolder.addComponent(file2);
        videosFolder.addComponent(file3);
        rootFolder.addComponent(imagesFolder);
        rootFolder.addComponent(videosFolder);

        rootFolder.showDetails("");

        System.out.println("\nTotal size of Root folder: " + rootFolder.getSize() + " KB");
    }
}