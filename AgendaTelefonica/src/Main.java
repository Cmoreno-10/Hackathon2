import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Contacto contactoAux = new Contacto();

        int opcion;

        // Recorrido del menú
        do {
            // Listar el menu
            System.out.println("==== Menú =====\n" +
                    "1. Agregar contacto\n" +
                    "2. Verificar existencia de contacto\n" +
                    "3. Listar contactos\n" +
                    "4. Buscar contacto\n" +
                    "5. Eliminar contacto\n" +
                    "6. Validar si la agenda esta llena\n" +
                    "7. Validar espacio de agenda\n" +
                    "8. Salir\n");

            // Solicitar opción de usuario
            System.out.print("Seleccione una de las opciones previas: ");
            opcion = scanner.nextInt();

            // Condicionar el ingreso del usuario
            switch (opcion)
            {
                case 3:
                    contactoAux.listarContactos();
                    break;
                case 5:
                    //Cambiar el parametro por dato buscado
                    contactoAux.eliminarContacto(contactoAux);
                case 8:
                    System.out.println("Gracias por visitar tu agenda telefonica. Adiós.");
                    break;
            }

        } while (opcion != 8);
    }
}
