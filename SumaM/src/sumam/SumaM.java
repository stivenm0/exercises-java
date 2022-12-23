
package sumam;

import java.util.Scanner;

public class SumaM {

   public static void main(String args[]){

      Scanner en = new Scanner(System.in);
      
      System.out.print("¿primer valor?");
      int uno= en.nextInt();
 
       System.out.print("¿segundo valor?");
      int dos= en.nextInt();
      
      
      Suma valores= new Suma(uno , dos);
      
      valores.imprimir();
      
 }  
}
