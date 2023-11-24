import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EliminarMetade {

    public static void main(String[] args) {
        ArrayList<String> listaDeNomes = new ArrayList<>(Arrays.asList("Alana", "Angelo", "Caio", "Kadu", "Diego Castan",
                "Diego Alencar", "Eduarda", "Esther", "Felipe", "Laura", "Lucas", "Gabriel Bonaretti", "Giovanna Fiuza", "Giovana Souza",
                "Giovana Radaeli", "Henrique", "Julia", "Nicole"));

        Random rand = new Random();

        int tamanhoLista = listaDeNomes.size();

        if (tamanhoLista % 2 == 0) {
            for (int i = 0; i < (tamanhoLista / 2); i++) {
                listaDeNomes.remove(rand.nextInt(listaDeNomes.size()));
            }
            System.out.println(listaDeNomes);
        } else {
            for (int i = 0; i < ((tamanhoLista + 1) / 2); i++) {
                listaDeNomes.remove(rand.nextInt(listaDeNomes.size()));
            }
            System.out.println(listaDeNomes);

        }
    }
}