package remembrance_pattern;

public class Client {

    MementoCaretaker mc = new MementoCaretaker();
    int index = 0;

    /**
     * 下棋
     *
     * @param cm
     */
    public void play(Chessman cm) {
        mc.setChessmanMemento(cm.save());
        index++;
        cm.show();
    }

    /**
     * 悔棋
     *
     * @param cm
     */
    public void undo(Chessman cm) {
        index--;
        cm.restore(mc.getChessmanMemento(index));
        cm.show();
    }

    /**
     * 撤销悔棋
     *
     * @param cm
     */
    public void redo(Chessman cm) {
        index++;
        cm.restore(mc.getChessmanMemento(index));
        cm.show();
    }
}
