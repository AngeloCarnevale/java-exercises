import java.util.ArrayList;
import java.util.Scanner;

public class Primos {

    public static int retornaInput(Scanner sc) {
        while (true) {
            try {
                System.out.print("Digite um numero inteiro: ");
                return sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
            }
        }
    }

    public static ArrayList<Integer> verificaPrimos(int numero) {
        ArrayList<Integer> listaPrimos = new ArrayList<Integer>();
        int count;

        for (int i = 1; i <= numero; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }

            if (count <= 2) {
                listaPrimos.add(i);
            }
        }

        return listaPrimos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = retornaInput(sc);

        ArrayList<Integer> listaPrimos = verificaPrimos(number);

        System.out.println(listaPrimos);
    }
}