
package hilos;


public class Hilos {

    
    public static void main(String[] args) {
       
        proceso1 hilo1 = new proceso1();
        Thread hilo2 = new Thread(new proceso2());
        
        hilo1.start();
        hilo2.start();
        
        
    }
    
}
