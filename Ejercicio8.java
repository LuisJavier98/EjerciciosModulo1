import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    int[] array = new int[numero];
    for (int i = 0; i < array.length; i++) {
      int valor = input.nextInt();
      array[i] = valor;
    }
    System.out.println(Arrays.toString(array));
    int numeroMax = array[0];
    for (int i = 0; i < array.length; i++) {
      if (numeroMax < array[i]) {
        numeroMax = array[i];
      }
    }
    System.out.println(String.format("El numero maximo es %s", numeroMax));
  }
}
