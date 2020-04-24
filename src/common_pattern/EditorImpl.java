package common_pattern;

public class EditorImpl implements Editor {
    @Override
    public void save() {
        System.out.println("save file!");
    }

    @Override
    public void open() {
        System.out.println("open file!");
    }

    @Override
    public void close() {
        System.out.println("close file!");
    }
}
