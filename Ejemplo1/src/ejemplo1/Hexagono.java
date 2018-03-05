/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;
//clase metodo
import java.util.Scanner;
/**
 *
 * @author HARBEY
 */
public class Hexagono {
    public static void main(String[] args) {
  //declaracion de varianles
    double dimension,apotema,area;
     Scanner valor=new Scanner(System.in);
      //ingreso de datos
     System.out.println("INGRESE EL VALOR DE LA DIMENSION (L)");
     System.out.print("dimension=");
     dimension=valor.nextDouble();
     System.out.println("INGRESE EL VALOR DE LA APOTEMA(AP)");
     System.out.print("apotema=");
     apotema=valor.nextDouble();
     area=(6*dimension*apotema)/2;
     System.out.println("EL AREA ES = "+ area);
}
}