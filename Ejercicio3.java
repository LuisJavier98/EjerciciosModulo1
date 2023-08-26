import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int consumo = input.nextInt();
    double pago = 0;
    if (consumo <= 50) {
      pago += 10;
    }
    if (consumo > 50 && consumo <= 200) {
      pago += 10 + 0.5 * (consumo-50);
    }
    if (consumo > 200) {
      pago += 10 + (200 - 50) * 0.5 + 1.5 * (consumo-200);
    }
    System.out.println("Va a pagar " + String.format("$%s", pago));
  }
}
