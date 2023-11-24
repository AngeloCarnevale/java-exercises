package calculadora;

import java.util.Properties;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int menu_figuras(){
        System.out.println("------------------");
        System.out.println("Qual dessas figuras você deseja calcular?");
        System.out.println("1- Planas");
        System.out.println("2- Solidas");
        System.out.println("------------------");
        int esc = sc.nextInt();
        return esc;
    }
    public static void main(String[] args) {

        while (true) {

            int menu = menu_figuras();

            if (menu == 1) {
                int escolha = Menu.menu_figuras_planas();

                switch (escolha) {
                    case 1:
                        System.out.println("Digite o raio em centimetros: ");
                        double r = sc.nextDouble();
                        Circulo circulo = new Circulo(r);
                        double a_circulo = circulo.calcularArea();
                        double c_circulo = circulo.calcularCircunferencia();
                        System.out.printf("Area: %.2fcm²\nCircunferencia: %.2fcm\n", a_circulo, c_circulo);
                        break;

                    case 2:
                        System.out.println("Digite o lado do quadrado em cm: ");
                        double re = sc.nextDouble();
                        Quadrado quadrado = new Quadrado(re);
                        double a_quadrado = quadrado.calcularArea();
                        double p_quadrado = quadrado.calcularPerimetro();
                        System.out.printf("Area: %.2fcm²\nPerimetro: %.2fcm\n", a_quadrado, p_quadrado);
                        break;

                    case 3:
                        System.out.println("Digite a base do retangulo em cm: ");
                        double base_r = sc.nextDouble();
                        System.out.println("Digite a altura do retangulo em cm: ");
                        double altura_r = sc.nextDouble();
                        Retangulo retangulo = new Retangulo(base_r, altura_r);
                        double a_retangulo = retangulo.calcularArea();
                        double p_retangulo = retangulo.calcularPerimetro();
                        System.out.printf("Area: %.2fcm²\nPerimetro: %.2fcm\n", a_retangulo, p_retangulo);
                        break;

                    case 4:
                        System.out.println("Digite a base do triangulo em cm: ");
                        double base_t = sc.nextDouble();
                        System.out.println("Digite a altura do triangulo em cm: ");
                        double altura_t = sc.nextDouble();
                        System.out.println("Insira os lados do triangulo em cm: ");
                        System.out.println("Lado 1: ");
                        double l1 = sc.nextDouble();
                        System.out.println("Lado 2: ");
                        double l2 = sc.nextDouble();
                        System.out.println("Lado 3: ");
                        double l3 = sc.nextDouble();
                        Triangulo triangulo = new Triangulo(base_t, altura_t, l1, l2, l3);
                        double a_triangulo = triangulo.calcularArea();
                        double p_triangulo = triangulo.calcularPerimetro();
                        System.out.printf("Area: %.2fcm²\nPerimetro: %.2fcm\n", a_triangulo, p_triangulo);
                        break;

                    case 5:
                        System.out.println("Digite o comprimento da diagonal maior em cm: ");
                        double D = sc.nextDouble();
                        System.out.println("Digite o comprimento da diagonal menor em cm: ");
                        double d = sc.nextDouble();
                        System.out.println("Insira os lados do triangulo em cm: ");
                        System.out.println("Lado 1: ");
                        double lado_1 = sc.nextDouble();
                        System.out.println("Lado 2: ");
                        double lado_2 = sc.nextDouble();
                        System.out.println("Lado 3: ");
                        double lado_3 = sc.nextDouble();
                        System.out.println("Lado 4: ");
                        double lado_4 = sc.nextDouble();
                        Losango losango = new Losango(D, d, lado_1, lado_2, lado_3, lado_4);
                        double a_losango = losango.calcularArea();
                        double p_losango = losango.calcularPerimetro();
                        System.out.printf("Area: %.2fcm²\nPerimetro: %.2fcm\n", a_losango, p_losango);
                        break;

                    case 6:
                        System.out.println("Digite a base do trapezio: ");
                        double b_trapezio = sc.nextDouble();
                        System.out.println("Digite a altura do trapezio: ");
                        double h_trapezio = sc.nextDouble();
                        Trapezio trapezio = new Trapezio(b_trapezio, h_trapezio);
                        double a_romboide = trapezio.calcularArea();
                        double p_romboide = trapezio.calcularArea();
                        System.out.printf("Area: %.2fcm²\nPerimetro: %.2fcm\n", a_romboide, p_romboide);
                        break;

                    case 7:
                        System.out.println("Quantos lados temo o seu poligono? ");
                        double lados = sc.nextDouble();
                        System.out.println("Digite a apotema do polígono: ");
                        double a_poligono = sc.nextDouble();
                        System.out.println("Digite o perimetro do poligono: ");
                        double l_poligono =  sc.nextDouble();
                        Poligono poligono = new Poligono(a_poligono, l_poligono, lados);
                        double area_poligono = poligono.calcularArea();
                        double p_poligono = poligono.calcularArea();
                        System.out.printf("Area: %.2fcm²\nPerimetro: %.2fcm\n", area_poligono, p_poligono);
                        break;

                    default:
                        System.out.println("Opcao invalida, tente novamente");
                }
            }else if (menu == 2){

                int escolha = Menu.menu_figuras_solidas();

                switch (escolha){
                    case 1:
                        System.out.println("Digite o comprimento das arestas: ");
                        double arestas = sc.nextDouble();
                        Cubo cubo = new Cubo(arestas);
                        double area_cubo = cubo.calcularArea();
                        double volume_cubo = cubo.calcularVolume();
                        System.out.printf("Area: %.2fcm²\nVolume: %.2fcm³\n", area_cubo, volume_cubo);
                        break;

                    case 2:
                        System.out.println("Digite o comprimento da base: ");
                        double basep = sc.nextDouble();
                        System.out.println("Digite o comprimento da profundidade: ");
                        double profundidade_p = sc.nextDouble();
                        System.out.println("Digite o comprimento da altura: ");
                        double altura_p = sc.nextDouble();
                        Paralelepipedo paralelepipedo = new Paralelepipedo(basep, profundidade_p, altura_p);
                        double area_p = paralelepipedo.calcularArea();
                        double volume_p = paralelepipedo.calcularVolume();
                        System.out.printf("Area: %.2fcm²\nVolume: %.2fcm\n", area_p, volume_p);
                        break;

                    case 3:
                        System.out.println("Digite o valor do raio: ");
                        double raio_esfera = sc.nextDouble();
                        Esfera esfera = new Esfera(raio_esfera);
                        double area_esfera = esfera.calcularArea();
                        double volume_esfera = esfera.calcularVolume();
                        System.out.printf("Area: %.2fcm²\nVolume: %.2fcm\n", area_esfera, volume_esfera);
                        break;

                    case 4:
                        System.out.println("Digite o valor do comprimento da base: ");
                        double comp_piramide = sc.nextDouble();
                        System.out.println("Digite o valor da altura: ");
                        double h_piramide = sc.nextDouble();


                    default:
                        System.out.println("Opcao invalida, tente novamente");
                }
            }

        }
    }
}
