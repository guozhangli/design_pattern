package remembrance_pattern;

import java.util.ArrayList;
import java.util.List;

public class MementoCaretaker {

    private List<ChessmanMemento> cms = new ArrayList<>();

    public ChessmanMemento getChessmanMemento(int i) {
        return cms.get(i);
    }

    public void setChessmanMemento(ChessmanMemento cm) {
        cms.add(cm);
    }
}
