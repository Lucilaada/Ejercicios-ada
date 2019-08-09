import java.util.Scanner;

/**
 * Ejercicio14
 */
public class Ejercicio14Array 
{
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) 
    {//int cantidadNumeros = 0;
     int suma = 0; 
     System.out.println(" Ingrese cantidad de numeros: ");
     int n = Teclado.nextInt();
     
     boolean hay13= false;
/*Declaro el array de n posiciones*/
     int [] numeros = new int [n];
//recorro el array para llenarlos
     for (int i = 0; i < n; i++)
     {
         System.out.println("Ingrese el numero");
         numeros [i]= Teclado.nextInt();
     }
 //recorro el for y pregunto por el 13 y el siguiente    
     for (int i = 0; i < n; i++)
     {
         if(numeros[i] == 13)
         {
             hay13 = true;//si hay 13 levanta la bandera// si no hay suma comun//
              
         }else
         {
             if (!hay13)
             {
                 suma = suma + numeros[i];// si no 13 hay suma el numero comun// si hay 13 saltea el siguiente numero//
             }else
             {
                 hay13 = false;//hubo 13
             }
         }
     }
     System.out.println( "La suma del array es:" + suma );
    }
}