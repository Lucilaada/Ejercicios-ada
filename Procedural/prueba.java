import java.util.Scanner;
/**
 * Ejercicio03
 */
public class prueba
{
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Cuantos son los sueldos a ingresar ? :");
        n = Teclado.nextInt();
        for(int i=0; i>=n; i++)
        {
            System.out.println("Ingrese el sueldo del empleado:");
        }
     
    }
}
     