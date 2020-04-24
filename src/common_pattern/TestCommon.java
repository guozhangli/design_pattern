package common_pattern;

public class TestCommon {

    public static void main(String[] args) {
        Editor editor = new EditorImpl();
        Macro macro = new Macro();
        macro.record(editor::open);
        macro.record(editor::save);
        macro.record(editor::close);
        macro.run();
    }
}
