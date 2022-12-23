
package clases;

import java.util.Scanner;
public class metodos {
    Scanner en= new Scanner(System.in);
    String nombre;
    
    public void pedirdatos(){
      
         System.out.print("tu nombre: ");
         nombre= en.nextLine();
    }
    
    public void imprimir(){
      System.out.println("te llamas: "+ nombre);
      
     
    }
}
