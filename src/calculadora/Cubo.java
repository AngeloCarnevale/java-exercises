package calculadora;

public class Cubo {
    double aresta;

    public Cubo(double arestas){
        this.aresta = arestas;
    }
    public double calcularArea() {
        double area = (aresta*aresta)*6;
        return area;
    }

    public double calcularVolume() {
        double volume = aresta*aresta*aresta;
        return volume;
    }
}

