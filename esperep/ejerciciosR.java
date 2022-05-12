package esperep;

/**
*/
public class ejerciciosR{
   
    public static void inprimirWileN1_10() {
        int numInit=21;
        while (numInit<=20) {

            System.out.println(numInit);
            numInit=numInit+1;
        }
    }
public static void inprimirWileN1_20() {
    int numInit=41;
    do {
        System.out.println(numInit);
        numInit++;
    } while (numInit<=40);
}

public static void inprimirForN1_20() {
    for(int numInit = 1; numInit <=20; numInit++){
         System.out.print(numInit);
    }
}
    public static void main(String[]args) {
        System.out.println("imprime while:"); inprimirWileN1_20();
        System.out.println("imprime do while:"); inprimirWileN1_20();
        System.out.println("imprime for"); inprimirForN1_20();
    }
}
