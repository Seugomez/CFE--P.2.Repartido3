public class Ejercicio2 {
    public static void main(String[] args) {
        int[] vec1 = {2, 6, 4, 5, 8, 9, 6, 4};
        int[] vec2 = {10, 2, 5, 10, 4, 7, 5, 6};

        System.out.println("Arrays originales:");
        System.out.print("vec1 = [");
        for (int i = 0; i < vec1.length; i++) {
            System.out.print(vec1[i]);
            if (i < vec1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("vec2 = [");
        for (int i = 0; i < vec2.length; i++) {
            System.out.print(vec2[i]);
            if (i < vec2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        int temp = vec1[1];
        vec1[1] = vec2[1];
        vec2[1] = temp;

        temp = vec1[3];
        vec1[3] = vec2[3];
        vec2[3] = temp;

        temp = vec1[5];
        vec1[5] = vec2[5];
        vec2[5] = temp;

        System.out.println("\nArrays después de los intercambios:");
        System.out.print("vec1 = [");
        for (int i = 0; i < vec1.length; i++) {
            System.out.print(vec1[i]);
            if (i < vec1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("vec2 = [");
        for (int i = 0; i < vec2.length; i++) {
            System.out.print(vec2[i]);
            if (i < vec2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}