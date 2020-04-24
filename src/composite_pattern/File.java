package composite_pattern;

public class File extends Component {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

    @Override
    public String getContent() {
        return "content";
    }

}
