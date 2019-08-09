import java.util.Scanner;

public class Ejercicio00 {
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {

        int A;
        A = Teclado.nextInt();
        int B;
        B = Teclado.nextInt();
        int C;
        C = A * B;
        System.out.println(C);
    
    }
}