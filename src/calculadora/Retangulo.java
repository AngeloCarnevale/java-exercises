package calculadora;

public class Retangulo {
    double b;
    double h;

    public Retangulo(double base, double altura){
        this.b = base;
        this.h = altura;
    }

    public double calcularArea(){
        double area = b*h;
        return area;
    }

    public  double calcularPerimetro(){
        double perimetro = 2*(b+h);
        return  perimetro;
    }
}