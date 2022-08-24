import java.util.InputMismatchException;
import java.util.Scanner;

public class ColeccionLibros {
    public static void main(String[] args) {
        String libros[][] = new String[100][3];
        menu();

    }

    public static void menu() {
        boolean salir = false;
        int opcion;

        while (!salir) {
            mostrarMenu();
            try {
                System.out.println("Escribe una de las opciones");
                opcion = ingresarInt();

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                ingresarString();
            }

        }
    }


    public static void mostrarMenu() {
        System.out.println("1. AGREGAR LIBRO");
        System.out.println("2. BUSCAR LIBRO");
        System.out.println("3. MOSTRAR ESPACIOS USADOS");
        System.out.println("4. MOSTRAR ESPACIOS DISPONIBLES");
        System.out.println("5. MOSTRAR TODA LA COLECCION");
        System.out.println("6. SALIR");


    }

    public static int ingresarInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String ingresarString(){
        return new Scanner(System.in).next();
    }



    public static String[][] agregarLibro(String misLibros[], String titulo, String autor, String editorial) {




    }

    public static int totalLibros(String misLibros[]) {

    }

    public static int espaciosDisponibles(String misLibros[]) {

    }


    public static void mostrarTotalLibros(String misLibros[]) {

    }

    public static void mostrarEspaciosDisponibles(String misLibros[]) {

    }

    public static void mostrarBusquedaLibroAutor(String misLibros[], String autor) {

    }

    public static void mostrarTodaColeccion(String misLibros[]) {

    }

}
