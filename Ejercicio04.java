import java.util.Scanner;

/**
 * Ejercicio04
 */
public class Ejercicio04 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int nMax = 0;
        int numero;
        int i;
        for (i = 1; i <= 15; i++) {
            System.out.println(" Ingrese numero ");
            numero = Teclado.nextInt();
            if (numero >= nMax) {
                nMax = numero;
                System.out.println(" Posicion relativa = " + i);
                System.out.println(" Valor maximo: " + nMax);
                
            }
        }
    }
}