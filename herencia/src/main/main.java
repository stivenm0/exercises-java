
package main;

import operaciones.Hijar;
import operaciones.Hijas;
public class main {
    public static void main(String args[]){
    
      Hijar mensajeror= new Hijar();
      Hijas mensajeros = new Hijas();
      
      mensajeror.recibirdatos();
      mensajeror.resta();
      System.out.print("el resultado de la resta es: ");
      mensajeror.resultado();
      
      mensajeros.recibirdatos();
      mensajeros.suma();
       System.out.print("el resultado de la suma es: ");
       mensajeros.resultado();
    }
    
}
