
package clase;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class clasepri {
    public static void main(String arg[]){
       double numero = 2;
       double raiz= Math.sqrt(numero);
       
       System.out.println("la raiz de: "+ numero+ " = " + raiz);
       
        //forma 1
       DecimalFormat df= new DecimalFormat("#.00");
       System.out.println("la raiz de: "+ numero+ " = " + df.format(raiz));
       
       //forma 2
       System.out.println("la raiz de: "+ numero+ " = " + String.format("%.3f",raiz));
    
        //forma 3
        System.out.println("la raiz de: "+ numero+ " = " + (double)Math.round(raiz*10000d)/10000);
    
        //forma 4
        BigDecimal bd= new BigDecimal(raiz);
        bd= bd.setScale(5,RoundingMode.HALF_DOWN);
        
        System.out.println("la raiz de: "+ numero+ " = " + bd.doubleValue());
    }
}
