import java.util.Scanner;

/**
 * agusarray
 */
public class agusarray {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
       // int[] agus = {10, 20, 30, 40};// se usa una de las dos opciones
        int [] agus= new int [4];
        for (int i = 0; i < 4; i++)
        {
        System.out.println("Ingrese un numero");
        agus [i]  = Teclado.nextInt();
        }



    }
}
