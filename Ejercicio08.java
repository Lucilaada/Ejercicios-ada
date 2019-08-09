import java.util.Scanner;

/**
 * Ejercicio08
 */
public class Ejercicio08
{
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) 
    {
    int calificacion;
     System.out.println(" Ingrese la calificacion obtenida ");
    calificacion = Teclado.nextInt();
    if (calificacion>0 & calificacion <= 10)
    {
        switch (calificacion)
        {
        case 10:
        System.out.println( "Tu calificacion es: A " );
        break;
        case 9:
        System.out.println(" Tu calificacion es: B ");
        break;
        case 8:
        System.out.println(" Tu calificacion es: C ");
        break;
        case 7:
        case 6:
        System.out.println(" Tu calificacion es: D ");
        break;
        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 0:
        System.out.println(" Tu calificacion es: F ");
        }
    }

    }
}