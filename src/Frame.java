import javax.swing.*;

public class Frame extends JFrame {
    Graph panel;

    String x;
    String y;

    Frame(){
        x = JOptionPane.showInputDialog("geben Sie die Steigung an: ");
        y = JOptionPane.showInputDialog("geben Sie den y-Achsenabschnitt an: ");
        panel = new Graph(x,y);
        JLabel yAchse = new JLabel("Y");
        yAchse.setBounds(47,30,10,10);
        this.add(yAchse);
        JLabel xAchse = new JLabel("X");
        xAchse.setBounds(553,545,10,10);
        this.add(xAchse);
        Integer yas = 500;
        for(int i = 50; i < 540; i = i+20){
            JLabel jl = new JLabel(yas.toString());
            yas = yas -20;
            jl.setBounds(20,i + 5,35,10);
            this.add(jl);
        }
        Integer xas = 20;
        int a = 5;
        for(int i = 60; i <= 540; i = i+20){
            JLabel jl = new JLabel(xas.toString());
            xas = xas +20;
            if(i < 100){
                jl.setBounds(i - 5,560 + a,35,10);
            }
            else{
                jl.setBounds(i - 10,560 + a,35,10);
            }
            a = a*-1;
            this.add(jl);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
