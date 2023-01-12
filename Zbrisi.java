import java.awt.event.ActionEvent;

public class Zbrisi extends MojGumb{

    public Zbrisi(GUI gui){
        super("zbrisi", gui);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gui.getContentPane().removeAll();
        gui.consructorGUI();
    }
}
