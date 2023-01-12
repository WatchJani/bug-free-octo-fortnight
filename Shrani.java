import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Shrani extends MojGumb{

    public Shrani(GUI gui){
        super("shrani", gui);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text fajli", "text");
        chooser.setFileFilter(filter);

        int res = chooser.showSaveDialog(null);
        if(res == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());


            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("Numbers");
                writer.newLine();
                writer.write(buttonToString());
                writer.close();
                System.out.println("Stanje je sahranjeno!");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }


    public  String buttonToString(){
        String res = "";
        Component[] komponente = gui.vsebina.getComponents();
        for(Component k : komponente){
            res += ((JButton) k).getText() + " ";
        }
        return  res;
    }
}
