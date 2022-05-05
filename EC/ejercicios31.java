mport java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        System.out.print("Ingresa el valor de edad: ");
        edad = in.nextInt();
        in.nextLine();
        if(edad>=18)
            System.out.println("Si puede votar en las proximas elecciones.");
        else
            System.out.println("No puede votar en las proximas elecciones.");
    }

}