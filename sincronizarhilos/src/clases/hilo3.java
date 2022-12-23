
package clases;

public class hilo3 extends Thread{
    
     @Override
    public void run(){
    
    for(int i=0; i<=3; i++){
    
        System.out.print("l");
        
    try{
        hilo3.sleep(1000);
        }catch(InterruptedException e){
         System.out.println("error hilo3");
        }
    }
    }
}
