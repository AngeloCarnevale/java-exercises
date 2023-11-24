package calculadora;

public class Esfera {
    double raio;

    public Esfera(double raio){
        this.raio = raio;
    }
    public double calcularArea() {
        return 4*3.14*(raio*raio);
    }

    public double calcularVolume() {
        return (4/3)*3.14*(raio*raio*raio);
    }
}
