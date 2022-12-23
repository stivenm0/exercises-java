
package clases;

public class hilo2 extends Thread{
    
     @Override
    public void run(){
    
    for(int i=0; i<=3; i++){
    
        System.out.print("o");
        
         try{
        hilo2.sleep(1000);
        }catch(InterruptedException e){
         System.out.println("error hilo2");
        }
    
    }

    
    }
}