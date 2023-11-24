import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true){
            try{
                System.out.println("Digite um número: ");
                numero = sc.nextInt();
                if (numero < 20){
                    continue;
                }
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Ops... Você digitou caracteres inválidos. Precisamos que digite apenas números");
            }
            sc.nextLine();
        }
        System.out.println(numero);

    }
}
