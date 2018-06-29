import java.util.Scanner;

public class Aritmetica {
  Scanner tecla = new Scanner(System.in);
  private double s, r, m, d;
  

  void inicio(){}
  void datos() {}

  void calculos(){
  s=prueba.getA()+prueba.getB();
  r=prueba.getA()-prueba.getB();
  m=prueba.getA()*prueba.getB();
  d=prueba.getA()/prueba.getB();
  }
  void resultados(){}
  public static void main(String []args) {
    Aritmetica a = new Aritmetica();

    a.inicio();
    a.datos();
    a.calculos();
    a.resultados();
  }
}
