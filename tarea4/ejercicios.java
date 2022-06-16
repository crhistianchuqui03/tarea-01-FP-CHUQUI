package tarea4;

import java.util.Scanner;

import estrepetitiva;

public class ejercicios {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio41() {
        //Definir variables
        double total=1500;
        //Proceso
        for (int i = 0; i < 6; i++) {
            total=total+(total*0.10);
            System.out.println("Su salario el "+(i+1)+" año sera de:"+total);
        }
    }
    public static void ejercicio42() {
        //Definir variables
        int n,tarjeta,hamburguesa;
        double total=0;
        //Datos de entrada
        System.out.println("Sencillo(1) \nDoble(2) \nTriple(3)");
        for (int i = 0; i < 3; i++) {
            hamburguesa=i+1;
            System.out.println("Ingrese la cantidad de hamburguesas del tipo "+ 
            (i+1)+":");
            n=lt.nextInt();
            switch (hamburguesa) {
                case 1:total=total+10*n; break;
                case 2:total=total+12*n; break;
                case 3:total=total+14*n; break;
                default: break;
            }
        }
        System.out.println("Elige el tipo de pago: \n1.- Efectivo \n2.-Trajeta de 
        credito");
        tarjeta=lt.nextInt();
        switch (tarjeta) {
            case 1:System.out.println("El total a pagar es de: "+total+" pesos"); 
           break;
		    case 2:total=total+(total*0.05); System.out.println("El total a pagar es de: 
            "+total+" pesos"); break;
            default: break;
        }
    }
    public static void ejercicio43() {
        //Definir variables
        int conta0=0,contaMas=0,contaMenos=0, n,num;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        n=lt.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Dame un numero: ");
            num=lt.nextInt();
            if (num<0) {
                contaMas=contaMas+1;
            } else if (num==0) {
                conta0=conta0+1;
            } else {
                contaMenos=contaMenos+1;
            }
        }
        System.out.println("La cantidad de numeros igual a 0 es: "+conta0);
        System.out.println("La cantidad de numeros mayor a 0 es: "+contaMas);
        System.out.println("La cantidad de numeros menor a 0 es: "+contaMenos);
    }
    public static void ejercicio44prof() {
        //Definir Variables
        int cantfocoV=0, cantfocoB=0, cantfocoR=0;
        String colorF="";
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese el color de Foco:\nV=Verde\nB=Blanco\nR- 
            Rojo");
            colorF=lt.next().toUpperCase();
            if (colorF.charAt(0)=='V') {
                cantfocoV++;
            }else if (colorF.charAt(0)=='B') {
                cantfocoB++;
            } else if (colorF.charAt(0)=='R') {
                cantfocoR++;
            }else{
                System.err.println("No es correcto el color de foco");
            }
            System.out.println("Tiene mas focos a evaluar?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        //Datos de salida
        System.out.println("La cantidad de focos de color Verde es: "+cantfocoV);
        System.out.println("La cantidad de focos de color Blanco es:" +cantfocoB);
        System.out.println("La cantidad de focos de color Rojo es: "+cantfocoR);
        System.out.println("La cantidad Total de focos son: "+ 
        (cantfocoV+cantfocoB+cantfocoR));
    }
    public static void ejercicio45() {
        //Definir variables
        int n;
        //Datos de entrada
        System.out.println("Ingrese el proceso deseado \n1.-While \n2.-For");
        n=lt.nextInt();
        switch (n) {
            case 1://Definir variables
                    int v=0;
                    double salario=1500;
                    while (v<6) {
                    salario=salario+(salario*0.10);
                    System.out.println("Su salario el "+(v+1)+" año sera 
                    de:"+salario);
                    v++;
                    }; break;
            case 2://Definir variables
                double total=1500;
                for (int i = 0; i < 6; i++) {
                total=total+(total*0.10);
                System.out.println("Su salario el "+(i+1)+" año sera de:"+total);
                }break;
            default:
                break;
        }
    }
    public static void ejercicio46() {
        //Definir variables
        int v;
        //Datos de entrada
        System.out.println("Ingrese el proceso deseado \n1.-While \n2.-For");
        v=lt.nextInt();
        switch (v) {
            case 1:ejercicio42(); break;
            case 2://Definir variables
                int i=0,n,tarjeta,hamburguesa;
                double total=0;
                //Datos de entrada
                System.out.println("Sencillo(1) \nDoble(2) \nTriple(3)");
                while (i<3) {
                hamburguesa=i+1;
                System.out.println("Ingrese la cantidad de hamburguesas del tipo "+  
                (i+1)+":");
                n=lt.nextInt();
                switch (hamburguesa) {
                    case 1:total=total+10*n; break;
                    case 2:total=total+12*n; break;
                    case 3:total=total+14*n; break;
                    default: break;
                }
                i++;
                }
                System.out.println("Elige el tipo de pago: \n1.- Efectivo \n2.- 
                Trajeta de credito");
                tarjeta=lt.nextInt();
                switch (tarjeta) {
                    case 1:System.out.println("El total a pagar es de: "+total+" 
                pesos"); break;
                    case 2:total=total+(total*0.05); System.out.println("El total a 
                pagar es de: "+total+" pesos"); break;
                    default: break;
                }
            default:break;
        }
    }
    public static void ejercicio47prof() {
        //Definir Variables
        int cantNumMayorcero=0, cantNumMenorIgualCero=0;
        double numN=0;
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese un numero:");
            numN=lt.nextDouble();
            if (numN<=0) {
                cantNumMenorIgualCero++;
            }else{
                cantNumMayorcero++;
            }
            System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }  
        //Datos de salida
        System.out.println("Cantidad de numeros Mayores de cero: "+cantNumMayorcero);
        System.out.println("Cantidad de numeros menores e iguales a cero:           
        "+cantNumMenorIgualCero);
        System.out.println("Total de numeros introducidos: "+      
        (cantNumMayorcero+cantNumMenorIgualCero));
    }
    public static void ejercicio48() {
        //Definir variables
        int años;
        double saldo=0, interes=0, total=0, deposito=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de años ahorrados: ");
        años=lt.nextInt();
        //Proceso
        while (años>0) {
            for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese el deposito del mes "+(i+1)+":");
            deposito=lt.nextDouble();
            saldo=saldo+deposito;
        }
        interes=interes+(saldo*0.10);
        total=saldo+interes;
        años=años-1;
        }
        //Datos de salida
        System.out.println("Tu ahorro en el año es: "+saldo);
        System.out.println("El interes ganado es: "+interes);
        System.out.println("Tu ahorro ya con interes es: "+total);
        System.out.println("");
    }
    public static void ejercicio49() {
        //Definir datos
        int n,salones,edad,suma=0,total=0,alumnos=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de salones: ");
        salones=lt.nextInt();
        while (salones>0) {
            System.out.println("Ingrese la cantidad de alumnos: ");
            n=lt.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese la edad del alumno: "+(i+1));
                edad=lt.nextInt(); 
                suma=suma+edad;
            }
            System.out.println("El promedio del salon "+salones+" es: "+(suma/n)+"               años");
            alumnos = alumnos + n;
            total = total + suma;
	        salones = salones - 1;
            suma=suma*0;
        }
          System.out.println("El promedio de toda la escuela es: "+(total/alumnos)+"           años");
    }
   
    }
    public static void ejercicio411() {
         //Definir Variables
         int cantidad;
         double tipo, total=0;
         String continuar="S";
         //Datos de entrada y proceso
         while (continuar.equals("S")) {
             System.out.println("Elige el tipo de billete o moneda: \nBilletes \n1.-              200 \n2.- 100 \n3.- 50 \n4.- 20 \n5.- 10 \nMonedas \n6.- 5 \n7.- 2                   \n8.- 1 \n9.- 0.50 \n10.- 0.20 \n11.- 0.10");
             tipo=lt.nextDouble();
             System.out.println("Cuanto es la cantidad de ese tipo: ");
             cantidad=lt.nextInt();
             if (tipo==1) {
                 total=total+(cantidad*200);
             } else if (tipo==2) {
                 total=total+(cantidad*100);
             }else if (tipo==3) {
                 total=total+(cantidad*50);
             }else if (tipo==4) {
                 total=total+(cantidad*20);
             }else if (tipo==5) {
                 total=total+(cantidad*10);
             }else if (tipo==6) {
                 total=total+(cantidad*5);
             }else if (tipo==7) {
                 total=total+(cantidad*2);
             }else if (tipo==8) {
                 total=total+(cantidad*1);
             }else if (tipo==9) {
                 total=total+(cantidad*0.5);
             }else if (tipo==10) {
                 total=total+(cantidad*0.2);
             }else{
                 total=total+(cantidad*0.1);
             }
             System.out.println("Tiene mas dinero?:\nS=Si\tN=No");
             continuar=lt.next().toUpperCase().equals("S")?"S":"N";
         }
         //Datos de salida
         System.out.println("El dinero total es: "+total);
    }
    
  
}
