import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el monto deseado a solicitar");
        int capitalSolicitado = in.nextInt();
        double interes = 0.50;
        System.out.println("Ingrese los meses en los que devolvera el prestamo");
        int periodo = in.nextInt();

        double interesAPagarFloat = (capitalSolicitado*interes*periodo);
        int interesAPagarInt = (int) (capitalSolicitado*interes*periodo);

        System.out.println("El monto total en float a pagar es de " + interesAPagarFloat);
        System.out.println("El monto total en int a pagar es de " + interesAPagarInt);
    }
}