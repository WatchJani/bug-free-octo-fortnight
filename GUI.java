import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    JPanel vsebina;
    public GUI(){
        consructorGUI();
    }

    public void consructorGUI(String [] tokens){
        this.consructorGUI();
        if( tokens != null){
            for (String s : tokens){
                vsebina.add(new JButton(s));
            }
        }
        this.revalidate();
    }

    public void consructorGUI(){
        this.setVisible(true);
        this.setSize(600, 400);
        this.setTitle("Numbers");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         vsebina = new JPanel();

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(1,4));

        JButton shrani = new Shrani(this);
        JButton nalozi = new Nalozi(this);
        JButton zbrisi = new Zbrisi(this);
        JTextField vnosnoPolje = new VnosnoPolje(this);

        menu.add(shrani);
        menu.add(nalozi);
        menu.add(zbrisi);
        menu.add(vnosnoPolje);

        //dodaj menu is vsebin na okna

        this.add(vsebina);
        this.add(menu, BorderLayout.SOUTH);

        this.revalidate();
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }

}
