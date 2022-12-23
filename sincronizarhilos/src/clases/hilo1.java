
package clases;


public class hilo1 extends Thread {
    
     @Override
    public void run(){
    
    for(int i=0; i<=3; i++){
    
        System.out.print("h");
        
       try{
        hilo1.sleep(1000);
        }catch(InterruptedException e){
         System.out.println("error hilo1");
        }
    }

    
 }
}