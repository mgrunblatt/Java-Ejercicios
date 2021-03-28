import java.util.Scanner;

public class main {


    public static void main (String args[]) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n= scanner.nextInt();
        System.out.println("Ingrese un numero:");
        int m= scanner.nextInt();

        multiplo(n,m);

    }

    public static void multiplo(int n, int m){

        for (int i=1; i<=n;i++){

            System.out.println(m*i);

        }

    }
}
