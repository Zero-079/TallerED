//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarAlInicio(5);
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(15);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(25);

        lista.eliminarPorValor(20);
        int valorABuscar = 15;
        boolean encontrado = lista.buscar(valorABuscar);
        System.out.println("El valor " + valorABuscar + " se encuentra en la lista: " + encontrado);

        lista.imprimirLista();
    }
}