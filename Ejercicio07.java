import java.util.Scanner;

/**
 * Ejercicio07
 */
public class Ejercicio07 {

  public static Scanner Teclado = new Scanner(System.in);

  public static void main(String[] args) {
    int valorServicio;
    int cantidadHoras;
    System.out.println(" Ingrese la cantidad de horas que permanecio el vehiculo en el estacionamiento ");
    cantidadHoras = Teclado.nextInt();
    if (cantidadHoras <= 2) {
      valorServicio = (2 * 5);
      System.out.println(" Precio por el uso de estacionamiento: $ " + valorServicio);
    } else {
      valorServicio = (2 * 5);
      if (cantidadHoras <= 5 & cantidadHoras > 2) {
        valorServicio = valorServicio + (cantidadHoras - 2) * 4;
        System.out.println(" Precio por el uso de estacionamiento: $ " + valorServicio);
      } else {
        valorServicio = valorServicio + (3 * 4);
        if (cantidadHoras <= 10 & cantidadHoras > 5) {
          valorServicio = valorServicio + (cantidadHoras - 5) * 3;
          System.out.println(" Precio por el uso de estacionamiento: $ " + valorServicio);
        } else {
          valorServicio = valorServicio + (5 * 3);
          valorServicio = valorServicio + (cantidadHoras - 10);
          System.out.println(" Precio por el uso de estacionamiento: $ " + valorServicio);
        }
      }
    }
  }
}