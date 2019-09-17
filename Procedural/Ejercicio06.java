import java.util.Scanner;
/**
 * Ejercicio06
 */
public class Ejercicio06 
{
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) 
    {
        double precioZona1, precioZona2, precioZona3, precioZona4, precioZona5;
        int zona;
        double peso;
        precioZona1 = 11.00;
        precioZona2 = 10.00;
        precioZona3 = 12.00;
        precioZona4 = 24.00;
        precioZona5 = 27.00;
        System.out.println(" Ingrese el numero de zona del destino a enviar el paquete" );
        zona = Teclado.nextInt();
        System.out.println(" Ingrese el peso en gramos del paquete ");
        peso = Teclado.nextDouble();
        

        if (peso < 5000.00) 
        {
            switch (zona) 
            {
            case 1:
                precioZona1 = precioZona1 * peso;
                System.out.println(" El precio para enviar su paquete con destino America del Norte es: $ " + precioZona1);
                break;
            case 2:
                precioZona2 = precioZona2 * peso;
                System.out.println(" El precio para enviar su paquete con destino America central es: $ " + precioZona2);
                break;
            case 3:
                precioZona3 = precioZona3 * peso;
                System.out.println(" El precio para enviar su paquete con destino America del Sur es: $ " + precioZona3);
                break;
            case 4:
                precioZona4 = precioZona4 * peso;
                System.out.println(" El precio para enviar su paquete con destino Europa es: $ " + precioZona4);
                break;
            case 5:
                precioZona5 = precioZona5 * peso;
                System.out.println(" El precio para enviar su paquete con destino Asia es: $ " + precioZona5);
                break;
            default:
                System.out.println(" El destino que ha ingresado no es correcto");
            }
            } else 
            {
            System.out.println(" Peso no permitido ");
            }

    }
}
