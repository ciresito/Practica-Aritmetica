import java.util.Scanner;

public class Aritmetica {
  Scanner tecla = new Scanner(System.in);

  DosNum prueba=new DosNum();
 
  void datos() {
  //Metodo para solicitar dos datos
        System.out.println("Escribir el primer dato:");
    	prueba.setA(tecla.nextDouble());
        System.out.println("Escribir el segundo dato:");
	    prueba.setB(tecla.nextDouble());
  }


  void inicio(){
	System.out.println("Crear una aplicación que acepte dos números del usuario efectúe las cuatro operaciones aritmeticas básicas y muestre los resultados");
	}
  
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
