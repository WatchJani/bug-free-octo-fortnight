import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VnosnoPolje extends JTextField implements ActionListener {

    public GUI gui;

    public VnosnoPolje(GUI gui){
        this.gui = gui;
        this.addActionListener(this);
        this.setHorizontalAlignment(JTextField.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String input = this.getText();
        try{
            Integer.parseInt(input);
            gui.vsebina.add(new JButton(input));
            gui.revalidate();
        }catch (Exception e){
            System.out.println("Invalid input " + input);
        }
        this.setText("");
    }
}
