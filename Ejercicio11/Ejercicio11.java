package Ejercicio11;

import Ejercicio11.Figuras.Circulo;
import Ejercicio11.Figuras.Rectangulo;
import Ejercicio11.Figuras.Triangulo;

public class Ejercicio11 {
  public static void main(String[] args) {
    Circulo circulo = new Circulo(5, "si", "azul");
    System.out.println("El Area del circulo es: " + circulo.getArea());
    System.out.println("El Perimetro del circulo es: " + circulo.getPerimeter());

    Triangulo triangulo = new Triangulo("Si", "Rojo", 5, 10);
    System.out.println("El area del triangulo es: " + triangulo.getArea());
    System.out.println("El perimetro del triangulo es: " + triangulo.getPerimeter());

    Rectangulo rectangulo = new Rectangulo("No", "Verde", 10, 40);
    System.out.println("El area del rectangulo es: " + rectangulo.getArea());
    System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimeter());
  }
}
