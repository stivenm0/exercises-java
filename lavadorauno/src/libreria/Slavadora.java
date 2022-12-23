
package libreria;


public class Slavadora {
    private int kilos=0 , tiporopa=0 , llenadocompleto=0, lavadocompleto=0 , secadocompleto=0;
    
 public Slavadora(int kilos , int tiporopa){//constructor
 this.kilos=kilos;
 this.tiporopa= tiporopa;
 }   
 
 private void llenado(){//llenado lavadora (limite de kilos es 12)
   if(kilos<=12){
     System.out.println("llenando lavadora");
     System.out.println("llenado");
   } else {
     System.out.println("limite de kilos excedido");
   }
     llenadocompleto=1;
 }
 
 private void lavado(){//lavado a tipo de ropa
     llenado();
  if(llenadocompleto==1){
   if(tiporopa==1){
    System.out.println("el tipo de ropa es blanca/lavado suave");
     System.out.println("lavando");
      lavadocompleto=1;
  } else if(tiporopa==2){
    System.out.println("el tipo de ropa es a color/lavado intenso");
     System.out.println("lavando");
     lavadocompleto=1;
  } else {
      System.out.println("opcion incorrecta");
   }
  } 
 }
 private void secado(){//secando
   lavado();
   if(lavadocompleto==1){
       System.out.println("secando ropa");
       secadocompleto=1;
   } else {
     System.out.println("error");  
   }
 }
 public void ciclofinal(){//final
   secado();
  if(secadocompleto==1){
    System.out.println("su ropa esta lista");
  } else {
     System.out.println("error");  
   }
 }//getter and setter de tipo de ropa
 public int gettiporopa(){
     return tiporopa;
 }
 public void settiporopa(int tiporopa){
     this.tiporopa= tiporopa;
 }
}
