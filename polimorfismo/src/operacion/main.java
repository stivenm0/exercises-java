
package operacion;


public class main {
    public static void main(String args[]){
    
        Operaciones mensajeros = new suma();//objeto que interactua diferente con cada clase
        Operaciones mensajeror = new resta();
        
        mensajeros.pedirdatos();
        mensajeros.qoperacion();
        mensajeros.resultado();
        
        mensajeror.pedirdatos();
        mensajeror.qoperacion();
        mensajeror.resultado();
    
    
    
    }
    
}
