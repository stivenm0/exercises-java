
package lavadoras;

import java.util.Scanner;
import libreria.Slavadora;
public class LavadoraUno {
    public static void main(String args[]){
    
    Scanner en= new Scanner(System.in);
    
     
     System.out.println("¡tipo de ropa? ");  
     System.out.print("1 para ropa blanca y 2 para ropa a color: ");
      int tiporopa= en.nextInt();
      
      System.out.print("¿kilos de ropa?: ");
      int kilos= en.nextInt();
      
      
      Slavadora mensajero = new Slavadora(kilos, tiporopa);
      mensajero.settiporopa(2);//asignar valor
      mensajero.ciclofinal();
      
      
      
    } 
}
