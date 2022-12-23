
package clases;


public class conversiones {
    public static void main(String arg[]){
     double angulogrados = 45;
     
     
     double anguloradiales = Math.toRadians(angulogrados);
     System.out.println("deg a rad: "+ angulogrados+"°" + " = "+ anguloradiales  );
    
     angulogrados = Math.toDegrees(anguloradiales);
     System.out.println("rad a deg: "+ anguloradiales +" = "+ angulogrados+"°");
     
    }
}
