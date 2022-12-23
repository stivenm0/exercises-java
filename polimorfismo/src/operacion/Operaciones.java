package operacion;

import java.util.Scanner;
public abstract class  Operaciones {
    protected int a , b , resultado;
    Scanner en= new Scanner(System.in);
    
public void pedirdatos(){
 System.out.print("primer valor: ");
 a= en.nextInt();
  
 System.out.print("segundo valor: ");
 b= en.nextInt();
}
public abstract void qoperacion();//poliformismo abstract

public void resultado(){
 System.out.println(resultado);
}
    
}
