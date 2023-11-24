import java.util.InputMismatchException;
import java.util.Scanner;

public class ColisãoDeTrens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a posição do trem A: ");
        int SOa = sc.nextInt();

        System.out.println("Digite a posição do trem B: ");
        int SOb = sc.nextInt();

        System.out.println("Digite a velocidade do trem A: ");
        double vA = sc.nextDouble();

        System.out.println("Digite a velocidade do trem B: ");
        double vB = sc.nextInt();

        double temp = (SOa - SOb) / (vB - vA);
        double tremA = SOa + (vA * temp);
        double tremB = SOb + (vB * temp);
        int tempoInicial = 61200;
        double tempoFinal = (tempoInicial + temp) / 60 / 60;

        if (vB > 0){
            System.out.println("Erro, a velocidade do trem B sempre será negativa.");
        }
        else if (tremA == tremB){
            System.out.println("A colisão irá ocorrer no KM "+tremA);
        }
        else {
            System.out.println("Não haverá colisão");
        }
        System.out.printf("tempo: %.0f segundos\n",temp * 60 * 60);
        System.out.printf("Horário da colisão: %f",tempoFinal);
    }
}
