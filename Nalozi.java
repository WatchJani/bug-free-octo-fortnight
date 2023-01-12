import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.io.*;

public class Nalozi extends MojGumb{

    public Nalozi(GUI gui) {
        super("nalozi", gui);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text fajli", "text");
        chooser.setFileFilter(filter);

        int res = chooser.showOpenDialog(null);
        if(res == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());


            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                if(! line.equals("Numbers")){
                    throw new Exception("Wrogn file!!");
                }

                line = reader.readLine();
                reader.close();

                gui.getContentPane().removeAll();
                gui.consructorGUI(line.split(" "));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
