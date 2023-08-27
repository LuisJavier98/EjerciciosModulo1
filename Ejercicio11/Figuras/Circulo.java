package Ejercicio11.Figuras;

import Ejercicio11.Figura;

public class Circulo extends Figura {
  private int radio;

  public Circulo(int radio, String isFill, String color) {
    super(isFill, color);
    this.radio = radio;
  }

  @Override
  public Double getArea() {
    return Math.PI * Math.pow(radio, 2);
  }

  @Override
  public Double getPerimeter() {
    return Math.PI * radio * 2;
  }

  public int getRadio() {
    return radio;
  }

}