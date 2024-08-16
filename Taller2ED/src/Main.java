import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = generateArray(1000000);
        int target = 999999; // Valor a buscar
        int repetitions = 10;

        // Medición del tiempo de la búsqueda lineal
        long linearTime = measureAverageTime(() -> a.serie(), repetitions);
        System.out.println("Tiempo medio de búsqueda lineal: " + linearTime + " ns");

        // El array debe estar ordenado para la búsqueda binaria
        Arrays.sort(array);

        // Medición del tiempo de la búsqueda binaria
        long binaryTime = measureAverageTime(() -> a.serie2(), repetitions);
        System.out.println("Tiempo medio de búsqueda binaria: " + binaryTime + " ns");
    }


    // Genera un array de tamaño dado con valores de 0 a size-1
    /*
     * private static int[] generateArray(int size): Es un método privado que genera y devuelve un array de enteros de tamaño size.
     * int[] array = new int[size];: Se crea un nuevo array de enteros del tamaño especificado.
     * for (int i = 0; i < size; i++) { array[i] = i; }: Se llena el array con valores del 0 hasta size - 1.
     * return array;: Retorna el array generado.
     */
    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
    private static long measureAverageTime(Runnable algorithm, int repetitions) {
        long totalTime = 0;
        for (int i = 0; i < repetitions; i++) {
            long startTime = System.nanoTime();
            algorithm.run();
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        return totalTime / repetitions;
    }
}