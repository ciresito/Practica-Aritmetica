import java.util.Scanner;

public class Aritmetica {
  Scanner tecla = new Scanner(System.in);
  private double s, r, m, d;
  DosNum prueba=new DosNum();

  void calculos(){
  s=prueba.getA()+prueba.getB();
  r=prueba.getA()-prueba.getB();
  m=prueba.getA()*prueba.getB();
  d=prueba.getA()/prueba.getB();
  }
  
  void datos() {
      //Metodo para solicitar dos datos
      System.out.print("Escribir el primer dato:");
      prueba.setA(tecla.nextDouble());
      System.out.print("Escribir el segundo dato:");
      prueba.setB(tecla.nextDouble());
  }


  void inicio(){
      System.out.println("Crear una aplicación que acepte dos números del");
      System.out.println("  usuario, efectúe las cuatro operaciones"); 
      System.out.println(" aritmeticas básicas y muestre los resultados");
  }
  
  void resultados(){
      System.out.println("El resultado de la Suma es: "+s);
      System.out.println("El resultado de la Resta es: "+ r);
      System.out.println("El resultado de la Multiplicacion es: "+ m);
      System.out.println("El resultado de la Division es: "+ d);
  }

  public static void main(String []args) {
    Aritmetica a = new Aritmetica();

    a.inicio();
    a.datos();
    a.calculos();
    a.resultados();
  }
}
