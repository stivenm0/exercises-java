
package clases;
import java.util.Scanner;
public class division {  
    public static void main(String[] args) {
        
        
    try{
        
        
   
    int a , b , c;
    Scanner en= new Scanner(System.in);
        
     System.out.print("primer valor: ");   
        a= en.nextInt();
        
        
     System.out.print("segundo valor: ");   
        b= en.nextInt();
        
     c=a/b;
    
     System.out.print("la division es: "+ c);   
    }catch(Exception er){
       System.out.print("Error");
    
    }finally{
        System.out.print("error");
    }
    }
   
     
  }  

