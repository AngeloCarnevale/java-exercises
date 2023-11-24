package swing;

import javax.swing.*;
import java.awt.*;

public class Rotulo extends JLabel {
    public Rotulo(){
        this.setBounds(100,100, 300, 200);
        this.setForeground(new Color(255, 0, 0));
        this.setFont(new Font("Arial", Font.BOLD, 40));
        this.setText("Texto exemplo");
    }

}
