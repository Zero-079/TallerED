import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Ingresa al menos 5 nombres de estudiantes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

        String respuesta;
        do {
            System.out.print("¿Deseas agregar otro nombre? (s/n): ");
            respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                nombres.add(nombre);
            }
        } while (respuesta.equalsIgnoreCase("s"));

        imprimirNombres(nombres);

        System.out.print("\nIngresa el nombre que deseas buscar: ");
        String nombreBuscado = scanner.nextLine();
        buscarNombre(nombres, nombreBuscado);

        System.out.print("\nIngresa un nombre para agregar a la lista (solo si no está): ");
        String nombreParaAgregar = scanner.nextLine();
        agregarNombreSiNoExiste(nombres, nombreParaAgregar);

        imprimirNombres(nombres);

        System.out.print("\nIngresa el nombre que deseas eliminar de la lista: ");
        String nombreParaEliminar = scanner.nextLine();
        eliminarNombre(nombres, nombreParaEliminar);

        imprimirNombres(nombres);

        scanner.close();
    }

    public static void imprimirNombres(ArrayList<String> lista) {
        System.out.println("\nLista de estudiantes:");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }

    public static void buscarNombre(ArrayList<String> lista, String nombre) {
        if (lista.contains(nombre)) {
            System.out.println("El nombre " + nombre + " fue encontrado en la lista.");
        } else {
            System.out.println("El nombre " + nombre + " no fue encontrado en la lista.");
        }
    }

    public static void agregarNombreSiNoExiste(ArrayList<String> lista, String nombre) {
        if (!lista.contains(nombre)) {
            lista.add(nombre);
            System.out.println("El nombre " + nombre + " ha sido agregado a la lista.");
        } else {
            System.out.println("El nombre " + nombre + " ya está en la lista y no fue agregado.");
        }
    }

    public static void eliminarNombre(ArrayList<String> lista, String nombre) {
        if (lista.remove(nombre)) {
            System.out.println("El nombre " + nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println("El nombre " + nombre + " no se encontró en la lista y no fue eliminado.");
        }
    }
}