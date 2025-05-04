public class Ejercicio5 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
                if (j < columnas - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.print("\nDiagonal principal: ");
        for (int i = 0; i < filas; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}