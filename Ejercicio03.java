import java.util.Scanner;
/**
 * Ejercicio03
 */
public class Ejercicio03 
{
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int sueldoMinimo = 0;
        int sueldoBajo = 0;
        int sueldoMedio = 0;
        int sueldoAlto = 0;
        int sueldo;
        System.out.println(" Ingresar sueldo ");
        sueldo = Teclado.nextInt();
        while (sueldo>0)
        {
            if(sueldo <= 520)
            {
            sueldoMinimo = sueldoMinimo + 1;
            System.out.println(" Cantidad de sueldos minimos: " + sueldoMinimo );
            }else 
            {
              if (sueldo < 520 & sueldo <= 780)
              {sueldoBajo = sueldoBajo + 1;
                System.out.println(" Cantidad de sueldos bajos: " + sueldoBajo);
              }else
              {
                if(sueldo > 780 & sueldo <= 999)
                {sueldoMedio = sueldoMedio + 1;
                    System.out.println(" Cantidad de sueldos medios: " + sueldoMedio );
                }else sueldoAlto = sueldoAlto + 1;
                System.out.println(" Cantidad de sueldos altos: " + sueldoAlto);
              }
            }  
            sueldo = Teclado.nextInt();
        }
    } 
}

