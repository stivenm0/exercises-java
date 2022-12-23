
package clases;


public class hilo4 extends Thread{
    
    
   @Override
    public void run(){
    
    for(int i=0; i<=3; i++){
    
        System.out.println("a");
        
        try{
        hilo4.sleep(1000);
        }catch(InterruptedException e){
         System.out.println("error hilo4");
        }
        
    
    }
    
    
    
    }
    
    
}
