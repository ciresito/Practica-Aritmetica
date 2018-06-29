import java.util.Scanner;

public class Aritmetica {
  Scanner tecla = new Scanner(System.in);
  DosNum prueba=new DosNum();
  void inicio(){}
  void datos() {
  //Metodo para solicitar dos datos
        System.out.println("Escribir el primer dato:");
    	prueba.setA=tecla.nextDouble();
        System.out.println("Escribir el segundo dato:");
	    prueba.setB=tecla.nextDouble();
  }
  void calculos(){}
  void resultados(){}
  public static void main(String []args) {
    Aritmetica a = new Aritmetica();

    a.inicio();
    a.datos();
    a.calculos();
    a.resultados();
  }
}
