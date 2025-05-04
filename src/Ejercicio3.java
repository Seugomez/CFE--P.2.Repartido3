import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro", "Juan"};

        System.out.print("Nombres en arreglo: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Buscar: ");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El nombre " + nombreBuscado + " se encuentra en el arreglo.");
        } else {
            System.out.println("El nombre " + nombreBuscado + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }
}