package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica circulo= new Circulo(5);
        FiguraGeometrica rectangulo= new Rectangulo(5,5);
        FiguraGeometrica triangulo= new Triangulo(5,10);

        System.out.println(rectangulo.area()+"");
        System.out.println(triangulo.area()+"");
        System.out.println(circulo.area()+"");

        FiguraGeometrica arrayFiguras []={circulo,triangulo, rectangulo};

        System.out.println(PromedioAreas.areaPromerio(arrayFiguras));
    }
}
