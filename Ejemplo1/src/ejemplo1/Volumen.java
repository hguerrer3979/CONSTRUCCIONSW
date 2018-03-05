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
public class Volumen {
       public static void main(String[] args) {
  //declaracion de varianles
     double radio,altura,volumen;
     Scanner valor=new Scanner(System.in);
     //ingreso de datos
     System.out.println("INGRESE EL VALOR DEL RADIO");
     System.out.print("radio=");
     radio=valor.nextDouble();
     System.out.println("INGRESE EL VALOR DE LA ALTURA");
     System.out.print("altura=");
     altura=valor.nextDouble();
     //calcular el volumen planteamiento de fomula A = πr2
     volumen=(3.14159*radio*radio*altura)/3;
     System.out.println("EL VOLUMEN ES = "+ volumen);
       }
  }     
      
       


