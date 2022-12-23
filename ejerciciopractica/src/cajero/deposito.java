
package cajero;


public class deposito extends claseprincipal{

    @Override
    public void accion() {
         System.out.print("¿cuanto desea depositar?: ");
         depositar();
         aux=getsaldo();
         setsaldo(aux+depositar);
          System.out.println("saldo actual. "+getsaldo());
    }
   
    
    
    
}
