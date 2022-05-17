package tarea1unidad2;

import java.util.Scanner;

public class ejercicio18 {
    
    static Scanner lt=new Scanner(System.in);

    public static void impuestoveiculo418() {
        //DEFINIR VARIABLES
        String cateV="";
        int cantidad=0;
        double costV=0, impunit=0, imptotal=0, totalimpv=0;
        //DATOS DE ENTRADA Y PROCESO Y SALIDA
        for (int i = 0; i < 3; i++) {
             System.out.println("ingrese la cantida de veivulo de categoria"+ (i+1)+":");
             cantidad = lt.nextInt();
             System.out.println("ingrese el precio de la categoria "+(i+1)+":");
             costV=lt.nextDouble();
             if(i==0){
                impunit=costV*0.10;
             }else if (i==1){
                 impunit=costV*0.07;
             }else{
                 impunit=costV*0.05;
             }
             imptotal=impunit*cantidad;
             System.out.println("impusto de categoria "+(i+1)+"es:"+impunit);
             System.out.println("impusto total de categoria "+(i+1)+"es:"+imptotal);
             totalimpv=totalimpv+imptotal;
        } 
        System.out.println("impusto total de veiculo es :"+totalimpv);
    }

    public static void main(String[] args) {
        impuestoveiculo418();
    }
}
