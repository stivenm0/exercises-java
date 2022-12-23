
package sumam;
 

public class Suma {
    private int Vuno , Vdos , resultado;
    
public Suma(int uno , int dos){
    this.Vuno= uno;
    this.Vdos= dos;   
}    
    
public void operacion(){
  resultado= Vuno + Vdos;  
}

public void imprimir(){
    operacion();
    System.out.println("el resultado es: "+resultado);
}



 
}
