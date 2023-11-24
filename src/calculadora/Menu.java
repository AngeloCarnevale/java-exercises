package calculadora;

import java.util.Scanner;

public class Menu {
    public static int menu_figuras_planas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Qual dessas figuras você deseja calcular?");
        System.out.println("1- Circulo");
        System.out.println("2- Quadrado");
        System.out.println("3- Retangulo");
        System.out.println("4- Triangulo");
        System.out.println("5- Losango");
        System.out.println("6- Trapezio");
        System.out.println("7- Poligono");
        System.out.println("------------------");
        int esc = sc.nextInt();
        return esc;
    } public static int menu_figuras_solidas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Qual dessas figuras você deseja calcular?");
        System.out.println("1- Cubo");
        System.out.println("2- Paralelepipedo");
        System.out.println("3- Esfera");
        System.out.println("4- Piramide de base quadrada");
        System.out.println("5- Cilindro");
        System.out.println("6- Cone");
        System.out.println("------------------");
        int esc = sc.nextInt();
        return esc;
    }
}



