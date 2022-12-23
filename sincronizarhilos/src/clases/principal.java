
package clases;


public class principal {
    public static void main(String arg[]){
    
         hilo1 hilo1 = new hilo1();
         hilo2 hilo2 = new hilo2();
         hilo3 hilo3 = new hilo3();
         hilo4 hilo4 = new hilo4();
         
         
         
        hilo1.start();
        
        try{
        hilo1.sleep(10);
        }catch(InterruptedException e){
         System.out.println("error hilo1");
        }
        hilo2.start();
        
        try{
        hilo2.sleep(10);
        }catch(InterruptedException e){
         System.out.println("error hilo2");
        }
        
        
        hilo3.start();
        
        try{
        hilo3.sleep(10);
        }catch(InterruptedException e){
         System.out.println("error hilo3");
        }
        
        
        hilo4.start();
     try{
        hilo4.sleep(10);
        }catch(InterruptedException e){
         System.out.println("error hilo4");
        }
    
    
    
    }
}
