
package clases;

/**
 *
 * @author estiv
 */
public class recurso {
    public void imprimir(int a){
        if(a<=4){
            System.out.print(a+" ");
            imprimir(a+1);
        }
    }
}
