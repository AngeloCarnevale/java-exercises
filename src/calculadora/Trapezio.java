package calculadora;

public class Trapezio {
    double base;
    double altura;

    public Trapezio(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        double area = base*altura;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = base+base+altura+altura;
        return perimetro;
    }
}
