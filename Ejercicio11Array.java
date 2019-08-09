import java.util.Scanner;

/**
 * Ejercicio11Array
 */
public class Ejercicio11Array
{
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int [] edades = new int [10];
        for ( int i = 0; i <= 10; i++)
        {System.out.println(" Ingrese la edad: ");
        edades[10]= Teclado.nextInt();
        }
        int suma = 0;
        int promedio = 0;
        for ( int i = 0; i <= 10; i++)
        { suma = suma + edades[i];
        }
        promedio = suma/10;
        System.out.println(" El promedio de edades es: " + promedio);
        System.out.println(" Edades recibidas: " + (edades.length));
        for ( int i = 0; i <= 10; i++)
        {
        System.out.println(" Edad:" + edades[i]);
        }
        
    }
}