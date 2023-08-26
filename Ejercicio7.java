import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int factorial = input.nextInt();
    int numero = 1;
    for (int i = 1; i <= factorial; i++) {
      numero *= i;
    }


    System.out.println(String.format("El factorial de %s es %d", factorial, numero));
  }
}
