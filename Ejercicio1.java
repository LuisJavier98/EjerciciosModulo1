import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = input.nextInt();
    int pago = (numero > 40 ? 40 : numero) * 40 + (numero > 40 ? ((numero > 40 && numero < 48 ? numero - 40 : 8) * 80
        + (numero > 48 ? numero - 48 : 0) * 120) : 0);
    System.out.println("El dinero que recibirá es " + pago);
  }
}