
package clases;
        
public class main {
    public static void main(String args[]){
     
        
        
      run hilo1= new run("hilo1");
      run hilo2= new run("hilo2");
      
      
       
      hilo1.start();
      
      
      
      try{
      hilo2.sleep(1000);
      }catch(InterruptedException e){
          System.out.print("error"+e);
      }
      hilo2.start();
      
      
      
      
      hilo2.stop();
    }
           
}
