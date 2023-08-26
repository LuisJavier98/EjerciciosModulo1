import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    for (int i = 1; i <= numero; i++) {
      System.out.println("*".repeat(i));
    }

    
  }
}
