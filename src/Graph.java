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
        graphics2D.setStroke(new BasicStroke(1));
        for(int i=20;i<500;i=i+10){graphics2D.drawLine(i,495,i,505);};
        for(int i=20;i<500;i=i+10){graphics2D.drawLine(5,i,15,i);};



    }
}
