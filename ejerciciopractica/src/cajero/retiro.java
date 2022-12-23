
package cajero;

public class retiro extends claseprincipal {
 
    
       
    
    @Override
    public void accion() {
      System.out.print("¿cuanto desea retirar?: ");
      retiro();
        aux=getsaldo();
      if(retirar <= getsaldo()){
          setsaldo(aux -retirar);
          System.out.println("retiraste. " + retirar);
          System.out.println("saldo actual. "+ getsaldo());
      }else{
        System.out.println("saldo insuficiente");
      }
    }
    
}
