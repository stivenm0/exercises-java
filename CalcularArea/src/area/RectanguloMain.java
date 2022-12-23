
package area;

import java.util.Scanner;


public class RectanguloMain {
    public static void main(String[] args){
    
       Scanner en= new Scanner(System.in);
    
       System.out.print("dame la altura: ");
       int altura= en.nextInt();
       
       System.out.print("dame la base: ");
       int base= en.nextInt();
       
       
       Rectangulo objeto= new Rectangulo(base , altura);
    
    objeto.imprimir();
    }
    
}
