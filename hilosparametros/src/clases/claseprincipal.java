
package clases;

public class claseprincipal {
    public static void main(String args[]){
     
        
        
      proceso hilo1= new proceso(" hilo1");
      proceso hilo2= new proceso(" hilo2");
      proceso hilo3= new proceso(" hilo3");
      
      hilo1.valor(2);
      hilo2.valor(4);
      hilo3.valor(6);
      
      hilo1.start();
      hilo2.start();
      hilo3.start();
      
    }
}
