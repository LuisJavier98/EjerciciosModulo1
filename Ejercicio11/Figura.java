package Ejercicio11;

public abstract class Figura {
  private String isFill;
  private String color;

  public Figura(String isFill, String color) {
    this.isFill = isFill;
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setIsFill(String isFill) {
    this.isFill = isFill;
  }

  public String getColor() {
    return color;
  }

  public String getIsFill() {
    return isFill;
  }
  public abstract Double getArea();
  public abstract Double getPerimeter();
}
