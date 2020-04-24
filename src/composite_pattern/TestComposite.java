package composite_pattern;

public class TestComposite {
    public static void main(String[] args) {
        Folder folder = new Folder("aa");
        folder.add(new File("bb.txt"));
        folder.add(new File("cc.txt"));
        Folder folder1 = new Folder("dd");
        folder.add(folder1);
        folder1.add(new File("ee.txt"));
        folder1.add(new File("ff.txt"));
        folder.print();
    }
}
