package calculadora;

public class Piramide {
    double Ab;
    double Al;
    double h;
    double Sb;

    public Piramide(double area_base, double area_lateral, double comprimento_da_base, double altura){
        this.Ab = area_base;
        this.Al = area_lateral;
        this.Sb = comprimento_da_base;
        this.h = altura;
    }
    public double calcularArea() {
        double area = Ab+(Al*4);
        return area;
    }
    public double calcularAreaBase() {
        double area = Ab+(Al*4);
        return area;
    }

    public double calcularVolume() {
        double volume = 1/3*(Sb*h);
        return volume;
    }
}
