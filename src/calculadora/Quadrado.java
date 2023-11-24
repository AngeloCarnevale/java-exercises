package calculadora;

public class Quadrado {
    double lado;

    public Quadrado(double lado){

        this.lado = lado;
    }

    public double calcularArea(){
        double area = lado*lado;
        return area;
    }

    public  double calcularPerimetro(){
        double perimetro = 4*lado;
        return  perimetro;
    }
}