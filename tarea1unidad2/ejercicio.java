package tarea1unidad2;

import java.util.Scanner;
/**
 * ejercicio
 */

public class ejercicio {
    static Scanner leert=new Scanner(System.in);

    public static int factorialn(int numero) {
        int resultado=1;
        if (numero>1){
            for (int i = 1; i <= numero; i++) {
                resultado=resultado*i;
        }
        }
    return resultado;
}

    public static void main(String[] args) {
        System.out.println(factorialn(5));
    } 
        
}
