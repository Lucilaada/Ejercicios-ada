import java.util.Scanner;
/**
 * Ejercicio13
 */
public class Ejercicio13Array
{
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int contVocales = 0;
        int contEspacios = 0;
        int contPuntos = 0;
        String oracion;/*creo las variables*/
        char[] letras;

        System.out.println(" Ingrese una oracion ");
        oracion = Teclado.nextLine();/*guarda la oracion en la variable*/
        letras = oracion.toCharArray();/*transforma la oracion en caracteres*/

        /*ya no se necesita el while xq ya se ingresaron todos los datos, se usa for usando la PROPIEDAD LENGHT*/

        for ( int i =0; i < letras.length; i++)
        {
        if (esVocal(letras[i]))
            {
                contVocales++;
            }else if ( letras[i] == ' ')
            {
                contEspacios++;
            }else if ( letras[i] == '.')
            {
                contPuntos++;
            }
        }   
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