import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

import javafx.scene.layout.TilePane;

/**
   *ejerccio20
  */
public class ejercicio20 {

    public static void main(String[] args) {
        //declarar variables
        int talla;
        double cantTela, costoTela, cantPant, pbase, utilUni, pFinal, utilTotal;
        String modelo;
        //datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese modelo:");
        modelo=lt.next();
        System.out.println("ingrese talla a confeccionar:");
        talla=lt.nextInt();
        System.out.println("cantidad de tela:");
        cantTela=lt.nextDouble();
        System.out.println("costo tela x Meta:");
        costoTela=lt.nextDouble();
        System.out.println("mt tela x pantalon:");
        cantPant=lt.nextDouble();
        //proceso
        cantPant=Math.round(cantTela/cantPant);
        if (modelo.equals("A")) {
            if (talla==32 || talla==36) {
                pbase=costoTela+costoTela*0.80+costoTela*0.04;
            }else{
                pbase=costoTela+costoTela*0.80;
            }

        } else {
                if (talla==32 || talla==36) {
                    pbase=costoTela+costoTela*0.80+costoTela*0.04;
                }else{
                    pbase=costoTela+costoTela*0.95;
                }
        }
        utilUni=pbase*0.30;
        pFinal=utilUni+pbase;
        utilTotal=utilUni*cantPant;
        //datos de salida
        System.out.println("precio de pantalon: "+pFinal);
        System.out.print("utilida total: "+utilTotal);
        }






    }