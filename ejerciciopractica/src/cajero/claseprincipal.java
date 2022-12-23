
package cajero;

import java.util.Scanner;
public abstract class claseprincipal {
    private static int saldo;
    protected int retirar , depositar, aux;
    Scanner en= new Scanner(System.in);
    
    
 public void consulta(){
   int cerrar=0;
   int seleccion=0;
   
   do{
   do{
       System.out.println("cajero:seleccione un numero");
       System.out.println("1.consultar saldo");
       System.out.println("2.retirar efectivo");
       System.out.println("3.depositar efectivo");
       System.out.println("4.salir");
       seleccion=en.nextInt();
       
    if(seleccion>=1 && seleccion<=4){
        cerrar=1;
        
    }else {
      System.out.println("opcion erronea");
    }
   }while(cerrar !=1);
   
   if(seleccion==1){
       claseprincipal mensajero = new consulta();// el mensajero de la clase y luego llamo el metodo abajo
       mensajero.accion();
   
     
   }else if(seleccion==2){
        claseprincipal mensajero = new retiro();
       mensajero.accion();
     
   }else if(seleccion==3){
        claseprincipal mensajero = new deposito();
       mensajero.accion();
     
   }else if(seleccion==4){
     cerrar=2;
   }
   
   
   }while(cerrar!=2);
 }
  
 public void retiro(){
   retirar= en.nextInt();
 }
public void depositar(){
 depositar=en.nextInt();
}
 public abstract void accion();
 
 public int getsaldo(){
  return saldo;
}
public void setsaldo(int saldo){
   this.saldo=saldo;
  }

}