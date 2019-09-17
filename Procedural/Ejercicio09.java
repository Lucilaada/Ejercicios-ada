import java.util.Scanner;
/**
 * Ejercicio09
 */
public class Ejercicio09 
{
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) 
    {
        int anio;
        System.out.println(" Ingrese un anio ");
        anio = Teclado.nextInt();
        if (esBisiesto(anio))
        {
            System.out.println(" Es anio bisiesto ");
        }else
        {
            System.out.println(" No es anio bisiesto ");
        }
    }
    public static boolean esBisiesto(int anio)
    {
        if(anio%4==0 & 
        (anio%100!=0 || anio%400==0))
        {  
            return true;
        }
            else
            { return false;
            }
    }
} 
      

