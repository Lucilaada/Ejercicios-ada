import java.util.Scanner;
/**
 * Ejercicio15ArrayLength
 */
public class Ejercicio15ArrayLength {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int [] a;
        int [] b;
        System.out.println("Ingrese el largo de los arreglos");
        n = Teclado.nextInt();
        a = new int [n];
        b = new int [n + 1];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Ingrese el elemento" + i);
            a[i] = Teclado.nextInt();
        }for (int i = 0; i < n + 1; i++)
        {
            System.out.println("Ingrese el elemento" + i + "de B");
            b[i] = Teclado.nextInt();
        }
        boolean resultadoComparacion;
        resultadoComparacion = commonEnd(a,b);
        System.out.println("Ambos array comparten el primer y/o ultimo elemento:" + resultadoComparacion);
    } 
    static public boolean commonEnd(int [] V1,int[]V2)
    {
        if(V1[0]==V2[0])
        {
            return true;
        }
        else if (V1[V1.length-1]==V2[V2.length-1])
        {
            return true;
        }
        return false;
    }
    } 

        
    
