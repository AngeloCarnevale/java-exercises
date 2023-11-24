package arrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("José");
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");

        System.out.println(listaDeNomes);

        listaDeNomes.remove(0); //Remove um item de acordo com o index
        System.out.println(listaDeNomes);

        listaDeNomes.remove("João"); //Remove o objeto
        System.out.println(listaDeNomes);

        listaDeNomes.add("José");
        listaDeNomes.add("João");
        System.out.println(listaDeNomes.get(1)); // Mostra um elemento do array pelo índice
        System.out.println("Tamanho do ArrayList: "+ listaDeNomes.size()); // Mostra o tamanho do ArrayList
    }
}
