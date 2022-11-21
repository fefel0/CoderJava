
public class Main {
    public static void main(String[] args) {
        System.out.println("Mostrar numero float e int");

        float valorFlotante = 3.1416f;

        int resultado = redondearFloat(valorFlotante);

        System.out.println("El  numero redondeado es " + resultado);
        System.out.println("El numero float es " + (valorFlotante - resultado));

    }

    private static int redondearFloat(float valorFlotante) {
        return Math.round(valorFlotante);
    }
}