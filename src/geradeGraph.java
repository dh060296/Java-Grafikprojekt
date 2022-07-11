import javax.swing.*;
import java.awt.*;

public class geradeGraph extends JPanel {
    String M;
    String N;
    String xs;
    String ys;

    String schritte;
    geradeGraph(String m, String n, String XS, String YS, String Schritte){
        this.setPreferredSize(new Dimension(1000,800));

        M = m;
        N = n;
        xs = XS;
        ys = YS;
        schritte = Schritte;
    }

    public void paint(Graphics g){
        int w = this.getWidth()/2;
        int h = this.getHeight()/2;
        int xmax = Integer.parseInt(xs);
        int ymax = Integer.parseInt(ys);
        int anzSchritte = Integer.parseInt(schritte);

        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setStroke(new BasicStroke(3)); //Strichdicke

        graphics2D.setPaint(Color.black);

        graphics2D.drawLine(w,0,w,h*2); //Y-Achse
        graphics2D.drawLine(0,h,w*2,h); //X-Achse

        //graphics2D
        graphics2D.setStroke(new BasicStroke(1));
        //x-Achsenbeschriftung
        for (int i = w; i <= 2*w; i = i + w/anzSchritte){
            graphics2D.drawLine(i,h-5,i,h+5);
        }
        for (int i = w; i >= 0; i = i - w/anzSchritte){
            graphics2D.drawLine(i,h-5,i,h+5);
        }

        //y-Achsenbeschriftung
        for (int i = h; i <= 2*h; i = i + h/anzSchritte){
            graphics2D.drawLine(w-5,i,w+5,i);
        }
        for (int i = h; i >= 0; i = i - h/anzSchritte){
            graphics2D.drawLine(w-5,i,w+5,i);
        }


        //Gerade
        int steigung = Integer.parseInt(M);
        int abschnitt = Integer.parseInt(N);
        //double a  = h-(abschnitt * (h / anzSchritte));
        double a = steigung * (w /anzSchritte);
        double b = steigung * (w / anzSchritte);
        int k = 250;
        graphics2D.drawString(String.valueOf(k),w+50,h-20);
        graphics2D.setStroke(new BasicStroke(2));
        graphics2D.drawLine(w,h - (abschnitt * (h/anzSchritte)),w*2,h - ((anzSchritte * steigung) * (h/anzSchritte)) - (abschnitt*(h/anzSchritte)));
        graphics2D.drawLine(w,h - (abschnitt * (h/anzSchritte)),0,h + ((anzSchritte * steigung) * (h/anzSchritte)) - (-abschnitt*(h/anzSchritte)));
    }
}
