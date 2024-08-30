import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int repetitions = 10;

        int[] num = generarNumerosAleatorios();

        // Medición del tiempo de la búsqueda lineal
        long linearTime = measureAverageTime(() -> hasDuplicate(num), repetitions);
        System.out.println("Tiempo medio de búsqueda lineal: " + linearTime + " ns");
        System.out.println(hasDuplicate(num));

        long linearTime2 = measureAverageTime(() -> hasDuplicate2(num), repetitions);
        System.out.println("Tiempo medio de búsqueda lineal: " + linearTime2 + " ns");
        System.out.println(hasDuplicate2(num));

        System.out.println("Números aleatorios generados:");
        for (int numero : num) {
            System.out.print(numero + " ");
        }
        System.out.println(" ");

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
    public static int[] generarNumerosAleatorios() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de números aleatorios a generar: ");
        int cantidad = scanner.nextInt();
        int[] array = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicate2(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

}