
package clases;


public class proceso extends Thread {
    
    int valorc;
    
    public proceso(String nombrehilo){
      super(nombrehilo);
    }
    @Override
    public void run(){
        for(int i =0; i <=valorc;i++){
            System.out.println(i+ this.getName());
            
        }
        System.out.println("");
    }
   public void valor(int valo){
     this.valorc=valo;
   }
}
