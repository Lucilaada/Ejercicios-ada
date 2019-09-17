import java.util.Scanner;
/**
 * Ejercicio05
 */
public class Ejercicio05 {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numeroVentas;
        int a=0;
        int b=0;
        int c=0;
        int t1=0;
        int t2=0;
        int t3=0;
        int tt=0;
        int cantidadVentas;
        int montoVenta;
        numeroVentas=tt;
        cantidadVentas=1;
        System.out.println("Ingrese el monto de la venta");
        montoVenta=Teclado.nextInt();
        while (cantidadVentas <= numeroVentas)
        {if (montoVenta > 1000)
            {
                a=a+1;
                t1=t1+1;
            }else
            {
                if (montoVenta > 500)
                {
                    b=b+1;
                    t2=t2+1;
                }else{
                    c=c+1;
                    t3=t3+1;
                }
            }
         tt=tt+montoVenta;
         cantidadVentas=cantidadVentas+1;   
        }
        System.out.println(" Ventas mayores a 1000: " + a);
        System.out.println(" Ventas mayores a 500: " + b);
        System.out.println(" Ventas menores o iguales a 500: " + c);
        System.out.println(" Total de ventas mayores a 1000: " + t1);
        System.out.println(" Total de ventas mayores a  500: " + t2);
        System.out.println(" Total de ventas menores o iguales a 500: " + t3);
        System.out.println(" Total de ventas: "+ cantidadVentas);
    }
}