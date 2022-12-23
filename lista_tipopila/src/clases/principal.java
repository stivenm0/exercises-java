
package clases;
import javax.swing.JOptionPane;
public class principal {

    

    
    public static void main(String arg[]){
      int opcion=0, nodo=0;
      pila pila = new pila();
    
       do{
       
       
       
       
       
       try{
      opcion= Integer.parseInt(JOptionPane.showInputDialog(null,  
                         "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La pila está vacía?\n"
                        + "4. ¿Cuál es el último valor ingresado en la pila?\n"
                        + "5. ¿Cuántos nodos tiene la pila?\n"
                        + "6. Vaciar Pila\n"
                        + "7. Mostrar contenido de la Pila\n"
                        + "8. Salir.\n\n"));

       
       switch(opcion){
       
           case 1: 
              nodo=Integer.parseInt( JOptionPane.showInputDialog("ingrese el dato"));
               
               pila.insertarnodo(nodo);
                 break;
                 
           case 2:  if(!pila.pilavacia()){
                 pila.eliminarnodo();
             JOptionPane.showMessageDialog(null, "se ha eliminado el ultimo valor ingresado");
           } else{
               JOptionPane.showMessageDialog(null,"la pila esta vacia");
           }  
                 break;
           case 3: 
               if(pila.pilavacia()){
                     JOptionPane.showMessageDialog(null, "pila esta vacia");            
               }else{
               JOptionPane.showMessageDialog(null,"la pila no esta vacia");
               }
                 break;
                 
           case 4:   if(!pila.pilavacia())    
              JOptionPane.showMessageDialog(null, pila.mostrarultimovalor());  
           else{
            JOptionPane.showMessageDialog(null, "esta vacia");
           }
                 break;
           case 5: 
              JOptionPane.showMessageDialog(null, pila.tamañopila());              
                 break;
                 
           case 6:    
                 if(!pila.pilavacia()){
                     pila.vaciarpila();
                      JOptionPane.showMessageDialog(null,"pila vaciada");
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"pila vacia");
                 }
               
               
                 break; 
       
           case 7: pila.mostrarvalores();
                 break;
                 
           case 8: opcion=8;
                    break;
           default:  
               JOptionPane.showMessageDialog(null,"Opcion erronea");       
                 break;
       
       
       
       }
       }catch(NumberFormatException e){
       
       }  
       
       }while(opcion !=8);
    
    
    
    
    
    
   
    }

    
}
