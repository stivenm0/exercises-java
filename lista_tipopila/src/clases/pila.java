
package clases;

import javax.swing.JOptionPane;


public class pila {
    private nodo ultimovalor;
    int tamaño=0;
    String lista="";
    
    //contructor para inicializar 
    public pila(){
     ultimovalor= null;
    }
    //metodo getter con booleano 
    public boolean pilavacia(){
      return ultimovalor==null;
    }
    //metodo setter de ultimovalor
    public void insertarnodo(int nodo){
      nodo nuevonodo= new nodo(nodo);
      nuevonodo.siguiente= ultimovalor;
      ultimovalor = nuevonodo; 
      tamaño++;
    }
    
   //metodo para eliminar nodo de pila
   public int eliminarnodo(){
       int aux = ultimovalor.informacion;
       ultimovalor= ultimovalor.siguiente;
       tamaño--;  
       return aux;
   }
    //metodo para conocer el ultimo valor ingresado
    public int mostrarultimovalor(){
      return ultimovalor.informacion;
    }
    
    //metodo para concoer el tamaño de pila
    public int tamañopila(){
     return tamaño;
    }
     //metodo vacir pila
     public void vaciarpila(){
       while(!pilavacia())
           eliminarnodo(); 
     }
     //mostrar lista
     public void mostrarvalores(){
         nodo recorrido=ultimovalor;
         
         while(recorrido!= null){
           lista+= recorrido.informacion +"\n";
           recorrido= recorrido.siguiente;
         }
         JOptionPane.showMessageDialog(null, lista);
         lista="";
     }
     
    
}
