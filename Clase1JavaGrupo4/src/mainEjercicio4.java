import java.util.Scanner;

public class main {


    public static void main (String args[]) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n= scanner.nextInt();
        boolean respuesta= false;
        int contador=n, i=1;

        while(contador!=0){
            if(numeroPrimo(i)){
                System.out.println(i);
                contador--;
            }
            i++;
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
