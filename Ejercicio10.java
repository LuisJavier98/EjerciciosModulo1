import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce el numero a buscar del 1 al 100");
    int numeroAbuscar = input.nextInt();
    for (int i = 0; i < i + 1; i++) {
      System.out.println("Trate de adivinar el numero xD :");
      int numero = input.nextInt();
      if (numero == numeroAbuscar) {
        System.out.println("Has acertado, felicidades!");
        break;
      } else if (numero < numeroAbuscar) {
        System.out.println("Número demasiado bajo, intenta nuevamente");
      } else if (numero > numeroAbuscar) {
        System.out.println("Número demasiado alto, intenta nuevamente");
      }
    }
    input.close();
  }
}
