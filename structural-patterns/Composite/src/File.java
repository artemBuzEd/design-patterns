public class File implements FileSystemComponent{
    private int size;
    private String name;

    File(String fileName, int size){
        name = fileName;
        this.size = size;
    }

    @Override
    public int getSize(){ return size; }

    @Override
    public void showDetails(String details){
        System.out.println(details + name + " (" + size + " KB)");
    }
    public String getName(){ return name; }


}
