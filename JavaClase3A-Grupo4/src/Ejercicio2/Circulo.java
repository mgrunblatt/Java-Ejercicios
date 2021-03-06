package Ejercicio2;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio,2);
    }
}
