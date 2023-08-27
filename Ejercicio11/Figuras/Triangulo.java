package Ejercicio11.Figuras;

import Ejercicio11.Figura;

public class Triangulo extends Figura {
  // Supongamos que es un triangulo equilatero
  double lado;
  double altura;

  public Triangulo(String isFill, String color, double lado, double altura) {
    super(isFill, color);
    this.lado = lado;
    this.altura = altura;
  }

  @Override
  public Double getArea() {
    return lado * altura / 2;
  }

  @Override
  public Double getPerimeter() {
    return lado * 3;
  }

  public double getAltura() {
    return altura;
  }

  public double getLado() {
    return lado;
  }
}
