
package clases;

public class trigonometria {
 public static void main(String arg[]){
    double resultado ;
    double angulogrados= 45;
    double anguloradiales = Math.toRadians(angulogrados);
    
    
    resultado= Math.sin(anguloradiales);
    System.out.println("seno de: "+ angulogrados +" = "+ resultado);
    
    
     resultado= Math.cos(anguloradiales);
    System.out.println("coseno de: "+ angulogrados +" = "+ resultado);
 
     resultado= Math.tan(anguloradiales);
    System.out.println("tangente de: "+ angulogrados +" = "+ resultado);
 
    double valor= 0.0700;
    
    anguloradiales= Math.acos(valor);
    angulogrados= Math.toDegrees(anguloradiales);
    System.out.println("el arco coseno de: "+ valor+ " = " + angulogrados);
    
 }
}