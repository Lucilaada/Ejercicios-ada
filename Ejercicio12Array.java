import java.util.Scanner;

/**
 * Ejercicio12
 */
public class Ejercicio12Array {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        {
            int[] conjuntoA = new int[7];
            int[] conjuntoB = new int[7];
            int[] conjuntoC = new int[7];
            for (int i = 0; i < 7; i++) {
                System.out.println(" Ingrese el primer conjunto de numeros: ");
                conjuntoA[i] = Teclado.nextInt();
            }
            for (int i = 0; i <7; i++) {
                System.out.println(" Ingrese el segundo conjunto de numeros: ");
                conjuntoB[i] = Teclado.nextInt();
            }
            for (int i = 0; i < 7; i++) {
                conjuntoC[i] = conjuntoA[i] + conjuntoB[i];
            }
            for(int i = 0; i < 7; i++)
            {
                System.out.println(" La suma de los conjuntos de numeros es: " + conjuntoC[i]);
            }
            
        }

    }
}
