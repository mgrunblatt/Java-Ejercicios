import java.util.Scanner;

public class main {


    public static void main (String args[]) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n= scanner.nextInt();
        boolean respuesta= false;
        if(n == 0){
            System.out.println("El numero ingresado no es primo");
        }else{
            respuesta = numeroPrimo(n);
            if(respuesta){
                System.out.println("El numero ingresado es primo");
            }else{
                System.out.println("El numero ingresado no es primo");
            }
        }
    }

    public static boolean numeroPrimo(int n){
        for (int i=2; i<n;i++){

            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
