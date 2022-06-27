import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {
    Graph(){
        this.setPreferredSize(new Dimension(1000,800));
    }

    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setStroke(new BasicStroke(3)); //Strichdicke

        graphics2D.setPaint(Color.black);

        graphics2D.drawLine(10,10,10,500); //Y-Achse
        graphics2D.drawLine(10,500,500,500); //X-Achse



    }
}
