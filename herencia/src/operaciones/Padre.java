
package operaciones;
import java.util.Scanner;
public class Padre {
     
   protected int a , b , resultado;
   Scanner en= new Scanner(System.in);
   
public void recibirdatos(){
     
  System.out.print("primer valor: ");
  a= en.nextInt();
  
  System.out.print("segundo valor: ");
  b= en.nextInt();
 }

 public void resultado(){
   System.out.println(resultado);
 
  }
}
