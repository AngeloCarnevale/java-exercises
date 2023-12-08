package screens;

import components.Text;
import entities.User;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Login extends JPanel {
    ArrayList<User> usuarios = new ArrayList<User>();
    User loggedUser;
    JTextField nome = new JTextField();
    JTextField cpf = new JTextField();
    Text nomeLabel = new Text("Nome", 300,180,100,20, Color.decode("#FFCC33"));
    Text cpfLabel = new Text("CPF", 300,280,40,20, Color.decode("#FFCC33"));
    Text title = new Text("Kali Delivery", 300,100,300,60, Color.decode("#FFCC33"), Font.BOLD, 50);

    public User getLoggedUser(){
        return loggedUser;
    }

    public void setUsuarios(ArrayList<User> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public Login(ArrayList<User> usuarios, Color color){
        this.usuarios = usuarios;

        nome.setBounds(300,200, 300,30);
        nome.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#FFCC33")));
        nome.setForeground(Color.white);
        nome.setOpaque(false);


        cpf.setBounds(300,300, 300,30);
        cpf.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.decode("#FFCC33")));
        cpf.setForeground(Color.white);
        cpf.setOpaque(false);



        add(nomeLabel);
        add(cpfLabel);
        add(nome);
        add(cpf);
        add(title);
        setBackground(color);
        setLayout(null);
        setVisible(true);
    }

    public boolean login(){
        for (User usuario: usuarios){
            if(Objects.equals(usuario.getCPF(), cpf.getText()) && Objects.equals(usuario.getName(), nome.getText())){
                this.loggedUser = usuario;
                return true;
            }
        }
        return false;
    }
}
