import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    int[] array = new int[numero];
    for (int i = 0; i < array.length; i++) {
      int valor = input.nextInt();
      array[i] = valor;
    }
    int[] newArray = new int[numero];
    System.out.println(Arrays.toString(array));
    for (int i = numero - 1; i >= 0; i--) {
      newArray[numero - 1 - i] = array[i];
    }
    System.out.println(Arrays.toString(newArray));

  }
}
