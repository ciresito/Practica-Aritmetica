import java.util.Scanner;

public class Aritmetica {
  Scanner tecla = new Scanner(System.in);

  void inicio(){
	System.out.println("Crear una aplicaci�n que acepte dos n�meros del usuario efect�e las cuatro operaciones aritmeticas b�sicas y muestre los resultados");
	}
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
