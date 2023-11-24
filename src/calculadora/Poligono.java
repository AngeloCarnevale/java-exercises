package calculadora;

public class Poligono{
    double apotema;
    double lado;
    double numero_lados;

    public Poligono(double apotema, double lado, double numero_lados) {
        this.apotema = apotema;
        this.lado = lado;
        this.numero_lados = numero_lados;
    }

    public double calcularArea() {
        double area = (lado*apotema)/2;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = lado*numero_lados;
        return perimetro;
    }
}
