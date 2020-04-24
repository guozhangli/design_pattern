package remembrance_pattern;

public class TestRemembrance {

    public static void main(String[] args) {
        Client client = new Client();
        Chessman cm = new Chessman("车", 1, 1);

        cm.setY(5);
        client.play(cm);//1,5
        cm.setX(2);
        client.play(cm);//2,5

        System.out.println("----悔棋----");
        client.undo(cm);//1,5

        cm.setY(4);
        client.play(cm);//

        cm.setX(3);
        client.play(cm);//3,4
        System.out.println("----悔棋----");
        client.undo(cm);//1,4
        System.out.println("----撤销悔棋----");
        client.redo(cm);//3,4


    }
}
