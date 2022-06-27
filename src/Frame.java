import javax.swing.*;

public class Frame extends JFrame {
    Graph panel;

    Frame(){
        panel = new Graph();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Graph");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
