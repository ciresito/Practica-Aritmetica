import java.util.Scanner;

public class Aritmetica {
  Scanner tecla = new Scanner(System.in);

  void inicio(){}
  void datos() {}
  void calculos(){}

  void resultados(){
      System.out.println("El resultado de la Suma es: ", s);
      System.out.println("El resultado de la Resta es: ", r);
      System.out.println("El resultado de la Multiplicacion es: ", m);
      System.out.println("El resultado de la Division es: ", d);
  }

  public static void main(String []args) {
    Aritmetica a = new Aritmetica();

    a.inicio();
    a.datos();
    a.calculos();
    a.resultados();
  }
}
