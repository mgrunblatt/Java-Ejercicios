package Ejercicio2;

public class PromedioAreas {

    public static double areaPromerio (FiguraGeometrica arr[]){
        double promedio=0;

        for (int i = 0; i < arr.length; i++ ){
            promedio+=arr[i].area();
        }

        return promedio/arr.length;
    }
}
