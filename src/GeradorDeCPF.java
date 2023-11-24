import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class GeradorDeCPF {
    public static void main(String[] args) {

        int numero = 0;
        int primeiro_digito;
        int index = 0;
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros_CPF = new ArrayList<>();
        ArrayList<Integer> novo = new ArrayList<>();


        for (int i = 0; i < 9; i++){
            System.out.printf("Digite o %d digito do CPF: ",i+1);
            int digitados = sc.nextInt();
            numeros_CPF.add(digitados);
        }

        // Primeiro dígito
        for (int i = 10; i >= 2; i--){
            System.out.println(i);
            numero = numeros_CPF.get(index) * i;
            novo.add(numero);
            index++;
        }

        // Segundo dígito
        for (int i = 11; i >= 2; i--){
            System.out.println(i);
            numero = numeros_CPF.get(index) * i;
            novo.add(numero);
            index++;
        }
        for (Integer i : novo){
            soma += i.intValue();
        }


        System.out.println(numeros_CPF);
        System.out.println(novo);
        System.out.println("A soma é: "+soma);
        primeiro_digito = 11-(soma%11);

        if (primeiro_digito > 9){
            primeiro_digito = 0;
        }
        novo.add(primeiro_digito);
        System.out.println(primeiro_digito);
    }
}
