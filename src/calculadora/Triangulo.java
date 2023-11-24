package calculadora;

public class Triangulo {
    double b;
    double h;
    double l1;
    double l2;
    double l3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.b = base;
        this.h = altura;
        this.l1 = lado1;
        this.l2 = lado2;
        this.l3 = lado3;
    }

    public double calcularArea() {
        double area = (b * h)/2;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = l1 + l2 + l3;
        return perimetro;
    }
}
