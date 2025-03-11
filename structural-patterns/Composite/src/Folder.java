import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    @Override
    public int getSize(){
        int size = 0;
        for(FileSystemComponent component : components){
            size += component.getSize();
        }
        return size;
    }

    @Override
    public void showDetails(String details){
        System.out.println(details + "+ " + name);
        for(FileSystemComponent component : components){
            component.showDetails("     " + details);
        }
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    public List<FileSystemComponent> getComponents() {
        return components;
    }

    public FileSystemComponent getComponent(int index) {
        return components.get(index);
    }
}
