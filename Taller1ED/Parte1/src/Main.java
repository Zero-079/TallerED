
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        scanner.close();

        imprimirNombres(nombres);
    }

    public static void imprimirNombres(ArrayList<String> lista) {
        System.out.println("\nLista de estudiantes:");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}