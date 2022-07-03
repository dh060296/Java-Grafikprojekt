import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {
    String M;
    String N;
    Graph(String m, String n){
        this.setPreferredSize(new Dimension(1000,800));
        M = m;
        N = n;
    }

    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setStroke(new BasicStroke(3)); //Strichdicke

        graphics2D.setPaint(Color.black);

        graphics2D.drawLine(50,50,50,550); //Y-Achse
        graphics2D.drawLine(50,550,550,550); //X-Achse

        //graphics2D
        graphics2D.setStroke(new BasicStroke(1));
        for (int i = 60; i < 550; i = i+20){
            graphics2D.drawLine(i,545,i,555);
        }
        for (int i = 60; i < 550; i = i+20){
            graphics2D.drawLine(45,i,55,i);
        }



        int steigung = Integer.parseInt(M);
        int abschnitt = Integer.parseInt(N);

        graphics2D.setStroke(new BasicStroke(2));
        graphics2D.drawLine(50,550-abschnitt,550,550-(steigung*500));

    }
}
