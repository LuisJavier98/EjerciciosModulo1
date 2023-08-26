import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int edad = input.nextInt();
    byte regalo = input.nextByte();

    if (edad >= 15 && regalo == 1) {
      System.out.println("Puede pasar");
    } else if (edad < 15 && (regalo == 1 || regalo == 0)) {
      System.out.println("Puede pasar");
    } else {
      System.out.println("No puede pasar");
    }
    input.close();
  }
}
