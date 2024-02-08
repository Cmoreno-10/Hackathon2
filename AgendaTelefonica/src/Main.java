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
            switch (opcion){
                case 1:
                    if  (contactoAux.getListaContactos().size() < 10) {
                        System.out.print("Ingrese el nombre: ");
                        String nombre = scanner.next();
                        System.out.print("Ingrese el apellido: ");
                        String apellido = scanner.next();
                        System.out.print("Ingrese el numero: ");
                        String numero = scanner.next();
                        contactoAux.agregarLista(new Contacto(nombre, apellido, numero));
                    } else {
                        System.out.println("Ha llegado al limite de contactos agregados.\n");
                    }
                    break;
                case 2:
                    System.out.print(" Nombre del contacto a consultar: ");
                    String nombreBuscado = scanner.nextLine();
                    System.out.println("El contacto existe: " + contactoAux.existeContacto(nombreBuscado));
                    break;
                case 3:
                    contactoAux.listarContactos();
                    break;
                case 4:
                System.out.print("Nombre del contacto a buscar: ");
                String nombreBuscar = scanner.nextLine();
                System.out.println("Teléfono: " +contactoAux.buscarContacto(nombreBuscar));
                    break;
                case 5:
                    Contacto contactoEliminar;
                    System.out.print("Ingrese el apellido que desea eliminar: ");
                    contactoEliminar = contactoAux.buscarApellido(scanner.next());
                    if(contactoEliminar.getApellido().equals(""))
                    {
                        System.out.println("Lo sentimos, el apellido que desea eliminar no se encuentra en la lista de contactos\n");
                    }
                    else
                    {
                        contactoAux.eliminarContacto(contactoEliminar);
                    }
                    break;
                case 6:
                    // Consultar si la agenda esta llena
                    System.out.println(contactoAux.agendaLlena());
                    break;
                case 7:
                    // Consultar si hay espacio libre
                    System.out.println(contactoAux.espaciolibre());
                    break;
                case 8:
                    System.out.println("Gracias por visitar tu agenda telefonica. Adiós.");
                    break;
            }

        } while (opcion != 8);
    }
}
