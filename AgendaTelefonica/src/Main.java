import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Recorrido del menú
        do {
            // Listar el menu
            System.out.println("==== Menú =====");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Verificar existencia de contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Validar si la agenda esta llena");
            System.out.println("7. Validar espacio de agenda");
            System.out.println("8. Salir\n");

            // Solicitar opción de usuario
            System.out.print("Seleccione una de las opciones previas: ");
            opcion = scanner.nextInt();

            // Condicionar el ingreso del usuario
            switch (opcion) {
                case 8:
                    System.out.println("Gracias por visitar tu agenda telefonica. Adiós.");
            }

        } while (opcion != 8);
    }
}
