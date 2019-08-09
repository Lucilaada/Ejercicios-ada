
import java.util.Scanner;

/**
 * Ejercicio10
 */
public class Ejercicio10 
{
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int contVocales = 0;
        int contEspacios = 0;
        int contPuntos = 0;
        char caracter;
        System.out.println(" Ingrese una oracion y poner .") ;
        caracter = Teclado.nextLine().charAt(0);
        while (caracter != '.') 
        {
            if (esVocal(caracter))
            {
                contVocales++;
            }else if ( caracter == ' ')
            {
                contEspacios++;
            }
            /*switch (caracter) {    
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            contVocales++;
            return true;

                break;
            case ' ':
                contEspacio++;
                break;}*/
        }
            caracter = Teclado.nextLine().charAt(0);
        
        //cantPuntos++;
        System.out.println(" Cantidad de vocales: " + contVocales);
        System.out.println(" Cantidad de Espacios: " + contEspacios);
        System.out.println(" Cantidad de puntos: " + contPuntos);
    }
    static boolean esVocal(char caracter)
    {
        switch (caracter) 
        {    
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            return true;
        }
        return false;
   }
}
