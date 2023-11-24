package arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Usuario> lista_de_usuarios = new ArrayList<>();
        lista_de_usuarios.add(new Usuario("Pedro", 18));
        lista_de_usuarios.add(new Usuario("João", 117));
        System.out.println(lista_de_usuarios);

        for(Usuario usuario:lista_de_usuarios){
            System.out.println("Nome: "+usuario.nome+"\n"+"Idade: "+usuario.idade);
        }
    }
}
