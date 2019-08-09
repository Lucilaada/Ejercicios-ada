import java.util.Scanner;

/**
 * Ejercicio01
 */
public class Ejercicio01 
{    
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) 
    {
        int A , D ;
        int B , C ;
        double F ;
        System.out.println(" Ingrese el valor A ");
        A = Teclado.nextInt();
        System.out.println(" Ingrese el valor B ");
        B = Teclado.nextInt();
        System.out.println(" Ingrese el valor C ");
        C = Teclado.nextInt();

        D = A + B + C;
        F = D / 3d;
        System.out.println(" El promedio es: " + F);
        
    }
}
