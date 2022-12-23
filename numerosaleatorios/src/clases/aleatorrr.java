
package clases;

import java.util.Random;
public class aleatorrr {
    public static void main(String arg[]){
        int aleatorio ;
        
        Random r = new Random();
        
        aleatorio= (int)(r.nextDouble()*100);
        System.out.println(aleatorio);
    }
}
