package ejerciciouno;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        String palabra = "", invertida = "";
        int tamaño = 0;
        Scanner en = new Scanner(System.in);

        System.out.print("¿cual es tu palabra?");
        palabra = en.nextLine();
        
       tamaño=palabra.length();
       
       do{
           invertida+=palabra.substring(tamaño -1, tamaño);
       
        tamaño--;
       
       }while(tamaño >0);
       System.out.print("palabra invertida: " + invertida);
       
    }

}
