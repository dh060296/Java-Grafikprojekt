import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoosingFrame extends JFrame implements ActionListener {
    public JButton btnGerade = new JButton("Gerade");
    public JButton btnParabel = new JButton("Parabel");
    public JButton btnKurve = new JButton("Kurve");
    ChoosingFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        this.add(btnGerade);
        this.add(btnParabel);
        this.add(btnKurve);
        btnGerade.addActionListener(this);
        btnParabel.addActionListener(this);
        btnKurve.addActionListener(this);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnGerade){
            this.setVisible(false);

        }
    }
}
