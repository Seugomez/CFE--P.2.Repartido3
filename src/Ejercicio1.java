public class Ejercicio1 {
    public static void main(String[] args) {
        int array[] = {10, 4, 5, 7, 3, 5, 7, 9, 4, 2, 5, 7, -56};
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("En el array hay:");
        System.out.println("- " + pares + " números pares");
        System.out.println("- " + impares + " números impares");

        System.out.print("Números pares: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Números impares: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
