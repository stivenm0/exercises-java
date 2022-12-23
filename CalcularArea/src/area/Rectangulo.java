
package area;


public class Rectangulo {
    private int base , altura, area;
    
 public Rectangulo(int base , int altura){
   this.base= base;
   this.altura= altura;
 }
 
 public void calcular(){
   area= base * altura;
 }
 
 public void imprimir(){
 calcular();
     System.out.println("el area es: "+area);
 
 }
}
