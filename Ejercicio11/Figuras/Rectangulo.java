package Ejercicio11.Figuras;

import Ejercicio11.Figura;

public class Rectangulo extends Figura {
  double ancho;
  double alto;

  public Rectangulo(String isFill, String color, double ancho,
      double alto) {
    super(isFill, color);
    this.alto = alto;
    this.ancho = ancho;
  }

  @Override
  public Double getArea() {
    return ancho * alto;
  }

  @Override
  public Double getPerimeter() {
    return ancho * 2 + alto * 2;
  }

}
