package calculadora;

public class Paralelepipedo {
    double base;
    double altura;
    double profundidade;

    public Paralelepipedo(double base, double altura, double profundidade){
        this.base = base;
        this.altura = altura;
        this.profundidade = profundidade;
    }
    public double calcularArea() {
        double area = (2*altura*profundidade) + (2*altura*base) + (2*base*profundidade);
        return area;
    }

    public double calcularVolume() {
        double volume = altura*base*profundidade;
        return volume;
    }
}
