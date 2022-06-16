package EC;

import java.util.Scanner;

import javax.swing.JSpinner.DefaultEditor;

import javafx.beans.binding.ObjectExpression;

public class ejerciciocondmult {
   
    public static void profeta() {
        System.out.println("enseñar");
    }

    public static void estudiante() {
        System.out.println("aprender");
    }

    public static void maquinaspc() {
        System.out.println("procesarinf");
    }

    public static void proyector() {
        System.out.println("muestrarinf");
    }
    public static void main(String[] args) {
        ejerciciocondmult obj=new ejerciciocondmult();
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el numero de algoritmo:\nl=profesor\n2=estudiante"+
        "\n3=maquinaspc\n4=proyector");
        int opcionMet=lt.nextInt();
        
        switch(opcionMet) {
           case 1:profeta();break;
           case 2:estudiante();break;
           case 3:maquinaspc();break;
           case 4:proyector();break;
           default: System.err.println("Esa opcion no exciste");break;
        }
    }
}
