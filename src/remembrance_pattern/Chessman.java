package remembrance_pattern;


public class Chessman {

    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * 保存状态
     *
     * @return
     */
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    /**
     * 恢复状态
     *
     * @param cm
     */
    public void restore(ChessmanMemento cm) {
        this.label = cm.getLabel();
        this.x = cm.getX();
        this.y = cm.getY();
    }

    public void show() {
        System.out.println(this.toString());
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Chessman{" +
                "label='" + label + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
