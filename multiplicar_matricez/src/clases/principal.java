
package clases;


public class principal {
    public  static void main(String arg[]){
        
        int Muno[][]= new int[2][3];
        int Mdos[][]= new int[3][2];
        int Mresul[][]= new int[2][2];
        
        
      //llenar matriz uno
      for(int i=0; i <2;i++){
        for(int j=0;j<3;j++){
        
           Muno[i][j]=(int)(Math.random()*5);
        }
      }
       //llenar matriz dos
       for(int i=0; i <3;i++){
        for(int j=0;j<2;j++){
        
           Mdos[i][j]=(int)(Math.random()*5);
        }                  
      }
    //lennar matriz resultado
    
    for(int i=0; i <2;i++){
        for(int j=0;j<2;j++){
         int aux;
         
         if(Mresul[0][0]==0){
         aux= (Muno[0][0]*Mdos[0][0]) + (Muno[0][1] * Mdos[1][0]) +(Muno[0][2]*Mdos[2][0]);
           Mresul[0][0]=aux;
           
         } else if (Mresul[1][0]==0){
             aux= (Muno[1][0]*Mdos[0][0]) + (Muno[1][1] * Mdos[1][0]) +(Muno[1][2]*Mdos[2][0]);
           Mresul[1][0]=aux;
           
         } else if (Mresul[0][1]==0){
            aux= (Muno[0][0]*Mdos[0][1]) + (Muno[0][1] * Mdos[1][1]) +(Muno[0][2]*Mdos[2][1]);
           Mresul[0][1]=aux;
         
         } else if (Mresul[1][1]==0){
             aux= (Muno[1][0]*Mdos[0][1]) + (Muno[1][1] * Mdos[1][1]) +(Muno[1][2]*Mdos[2][1]);
           Mresul[1][1]=aux; 
         }
        }
       }
    //imprimir matricez
    for(int i=0; i<3;i++){
        
        
        if(i<2){
          for(int j=0; j<3;j++){
          System.out.print("["+Muno[i][j]+"]");
          }
         
         if(i==1){
         System.out.print("  x  "); 
          }else {
         System.out.print("     ");
          }
        }else{
            System.out.print("              ");
        }
       
        for(int j=0; j<2;j++){
           System.out.print("["+Mdos[i][j]+"]");
        }
        if(i==1){
         System.out.print("  =  "); 
          }else {
         System.out.print("     ");
          }
        
        if (i<2){
        for(int j=0;j<2;j++){
           System.out.print("["+ Mresul[i][j]+"]");
           
         }
        }
        System.out.println(" ");
        
    
    }
      
  
    
 }
}