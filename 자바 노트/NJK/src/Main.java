import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Gugudan();
    }
}

class Gugudan extends Frame implements ActionListener, KeyListener {
    Panel p1, p2, p3, p4;
    Button b;
    TextField tf1, tf2, tf3, tf4;
    int n1, n2, n3;
    int tot = 0, corr = 0;
    Random r = new Random();

    public Gugudan() {
        setLayout(new GridLayout(4, 1));
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();
        b = new Button("확인");

        n1 = r.nextInt(9) + 1;
        tf1.setText("" + n1);
        tf1.setEditable(false);
        n2 = r.nextInt(9) + 1;
        tf2.setText("" + n2);
        tf2.setEditable(false);
        tf3.setText("");
        tf4.setText("");
        tf4.setEditable(false);
        tf4.setFocusable(false);
        setSize(400, 200);
        setVisible(true);

        p1.add(new Label("구구단 맞추기 게임"));
        p2.add(new Label("구구단 "));
        p2.add(tf1);
        p2.add(new Label("*"));
        p2.add(tf2);
        p2.add(new Label("="));
        p2.add(tf3);
        p3.add(b);
        p4.add(new Label("결과: "));
        p4.add(tf4);
        add(p1);
        add(p2);
        add(p3);
        add(p4);

        b.addActionListener(this);
        tf3.addKeyListener(this);
        addWindowListener(new WindowHandler());
        tf3.requestFocus();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String tmp = tf3.getText();
            if (tmp.equals("")) {
                n3 = 0;
            } else {
                n3 = Integer.parseInt(tmp);  // 수정: Integer.parseInt로 수정
            }
            tot++;
            if (n3 == n1 * n2) {
                corr++;
                tf4.setText("맞추었습니다.(" + corr + "/" + tot + ")");
            } else {
                tf4.setText("틀렸습니다.(" + corr + "/" + tot + ")");
            }

            n1 = r.nextInt(9) + 1;
            tf1.setText("" + n1);  // 수정: "" + n1
            n2 = r.nextInt(9) + 1;
            tf2.setText("" + n2);
            tf3.setText("");
            tf3.requestFocus();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

class WindowHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        Window w = e.getWindow();
        w.setVisible(false);
        w.dispose();
        System.exit(0);
    }
}
