package calculadora;

public class Circulo {
    double raio;
    double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        double area = Math.pow(raio, 2)*pi;
        return area;
    }

    public  double calcularCircunferencia(){
        double circunferencia = 2*pi*raio;
        return  circunferencia;
    }
}
