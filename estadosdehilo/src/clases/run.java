
package clases;



public class run extends Thread{
  
    public run (String nombrehilo){
      super(nombrehilo);
    
    
    }
    @Override
    public void  run(){
     
      for(int i=0; i<=3; i++){
       System.out.println(i + " "+ getName());
       try{
       run.sleep(1000);
     }catch(InterruptedException  e){
         System.out.print("error ");
     }
      }
     
    }
    
}
