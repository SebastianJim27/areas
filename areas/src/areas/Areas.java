
package areas;


import javax.swing.JOptionPane;

public class Areas {
  public static void main(String[] args) {
    FigurasGeometricas fg = new FigurasGeometricas();
    fg.leerDatos();
    fg.calcularAreas();
    fg.mostrarResultados();
  }
}

class FigurasGeometricas {
  private double base;
  private double altura;
  private double radio;
  private double areaCuadrado;
  private double areaCirculo;
  private final double pi = 3.1416;

  public void leerDatos() {
    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
    radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el radio"));
    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la altura "));
  }

  public void calcularAreas() {
    areaCuadrado = base * altura;
    areaCirculo = pi * (radio * radio);
  }

  public void mostrarResultados() {
    JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + areaCuadrado);
    JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + areaCirculo);
  }
}