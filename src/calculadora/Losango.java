package calculadora;

public class Losango {
    double D;
    double d;
    double l1;
    double l2;
    double l3;
    double l4;

    public Losango(double D, double d, double l1, double l2, double l3, double l4) {
        this.D = D;
        this.d = d;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    public double calcularArea() {
        double area = D*d;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = l1 + l2 + l3 + l4;
        return perimetro;
    }
}