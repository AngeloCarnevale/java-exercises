package swing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Janela window = new Janela("Título da Janela");
//        Rotulo rotulo = new Rotulo();
//        CampoTexto campoTexto = new CampoTexto();
//        Botao botao = new Botao("Click");
//
//        botao.addActionListener(e -> rotulo.setText(campoTexto.getText()));
//        window.add(rotulo);
//        window.add(campoTexto);
//        window.add(botao);
//        window.setVisible(true);

        JFrame frame = new JFrame("Exemplo Imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0, 800, 800);

        ImageIcon iconeAmpliado = new ImageIcon("src/Swing/Images/gif.gif");
        iconeAmpliado.setImage(iconeAmpliado.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));

        JLabel label = new JLabel(iconeAmpliado);
        frame.setVisible(true);
        frame.add(label);
    }
}
