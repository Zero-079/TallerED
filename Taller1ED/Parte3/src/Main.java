import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();

        String opcion;
        do {
            System.out.println("\nGestión de Tareas:");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Eliminar una tarea completada");
            System.out.println("3. Mostrar todas las tareas pendientes");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingresa la tarea que deseas agregar: ");
                    String tareaParaAgregar = scanner.nextLine();
                    agregarTarea(tareas, tareaParaAgregar);
                    break;
                case "2":
                    System.out.print("Ingresa la tarea que has completado para eliminarla: ");
                    String tareaParaEliminar = scanner.nextLine();
                    eliminarTarea(tareas, tareaParaEliminar);
                    break;
                case "3":
                    mostrarTareas(tareas);
                    break;
                case "4":
                    System.out.println("Saliendo del gestor de tareas...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (!opcion.equals("4"));

        scanner.close();
    }

    public static void agregarTarea(ArrayList<String> lista, String tarea) {
        lista.add(tarea);
        System.out.println("La tarea \"" + tarea + "\" ha sido agregada a la lista.");
    }

    public static void eliminarTarea(ArrayList<String> lista, String tarea) {
        if (lista.remove(tarea)) {
            System.out.println("La tarea \"" + tarea + "\" ha sido eliminada de la lista.");
        } else {
            System.out.println("La tarea \"" + tarea + "\" no se encontró en la lista.");
        }
    }

    public static void mostrarTareas(ArrayList<String> lista) {
        System.out.println("\nTareas pendientes:");
        if (lista.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            for (String tarea : lista) {
                System.out.println("- " + tarea);
            }
        }
    }
}