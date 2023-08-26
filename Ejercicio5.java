import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    int[] array = new int[numero];
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100);
      System.out.println(String.format("El elemento %s es : %d ", i, array[i]));
    }
  }
}
