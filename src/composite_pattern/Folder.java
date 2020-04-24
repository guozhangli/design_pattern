package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private String name;
    private List<Component> fileList;

    public Folder(String name) {
        this.name = name;
        this.fileList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
        if (component != null) {
            fileList.add(component);
        }
    }

    @Override
    public void remove(Component component) {
        fileList.remove(component);
    }

    @Override
    public void print() {
        System.out.println(getName());
        for (Component component : fileList) {
            if (component instanceof File) {
                File file = (File) component;
                System.out.println("--" + file.getName());
            } else if (component instanceof Folder) {
                Folder folder = (Folder) component;
                System.out.println("--" + folder.getName());
            }
        }
    }

    @Override
    public String getContent() {
        return super.getContent();
    }
}
