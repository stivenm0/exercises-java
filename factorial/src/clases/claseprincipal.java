
package clases;

import java.util.Scanner;
public class claseprincipal {
    public static void main(String arg[]){
    Scanner en= new Scanner(System.in);
    
    
    System.out.print("numero a sacar factorial: ");
    int numero=en.nextInt();
    
    recursividad r = new recursividad();
    int resul= r.resulta(numero);
    System.out.println("el factorial de : "+ numero + " es " +resul );
    
    
    
    
    }   
}
