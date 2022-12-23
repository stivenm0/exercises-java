
package clases;


public class recursividad {
    
    public int resulta(int numero){
        // el numero va decrementando
        if(numero>0){
            int aux= numero *resulta(numero-1);
             return aux;   
            
        }
        
     return 1;
    }
    
}
