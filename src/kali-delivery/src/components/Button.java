package components;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button(String name){
        super(name);
        this.setFocusable(false);
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setBackground(Color.white);
    }

    public Button(String name, int x, int y, int width, int height){
        super(name);
        setLocation(x, y);
        setSize(width, height);
        this.setFocusable(false);
        this.setBackground(Color.white);
    }

    public Button(String name, int x, int y, int width, int height, Color colorBG, Color colorFG){
        super(name);
        setLocation(x, y);
        setSize(width, height);
        setBackground(colorBG);
        setForeground(colorFG);
        this.setFocusable(false);
        this.setBackground(Color.white);
    }

}
