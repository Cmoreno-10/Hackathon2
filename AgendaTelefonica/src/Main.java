import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contacto> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int longitudAgenda = 10;
        long numeroAgenda;
        String nombreAgenda;

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
                case 1:
                    // Mensaje de seleccion de usuario
                    System.out.println("==== HA SELECCIONADO AGREGAR CONTACTO ====");

                    // Condicionar el agregar o no un usuario
                    if (agenda.size() < longitudAgenda) {
                        // Solicitud de numero a usuario
                        System.out.println("Ingrese el numero: ");
                        numeroAgenda = scanner.nextLong();

                        // Solicitud de nombre a usuario
                        System.out.println("Ingrese el nombre: ");
                        nombreAgenda = scanner.next();

                        // Agregar a array el contacto
                        agenda.add(new Contacto(nombreAgenda, numeroAgenda));
                        // Confirmar que el contacto ha sido agregado
                        System.out.println("El usuario " + nombreAgenda + "con numero de telefono " + numeroAgenda + " ha sido agregado.");
                    } else {
                        System.out.println("La agenda se encuentra completa. Elimine un contacto como alternativa.");
                    }
                    break;
                case 3:
                    System.out.println("==== HA SELECCIONADO MOSTRAR AGENDA ====");
                    mostrarAgenda(agenda);
                    break;
                case 6:
                    System.out.println("==== HA SELECCIONADO SABER SI LA AGENDA ESTA LLENA ====");
                    if (agenda.size() == longitudAgenda) {
                        System.out.println("La agenda se encuentra llena. Por favor elimine algún contacto de ser necesario.");
                    } else {
                        System.out.println("La agenda aún no se encuentra llena. Puede agregar más contactos.");
                    }
                    break;
                case 7:
                    System.out.println("==== HA SELECCIONADO SABER EL ESPACIO DISPONIBLE ====");
                    int espacioDisponible = longitudAgenda - agenda.size();
                    System.out.println("Tiene espacio para agregar [" + espacioDisponible + "] contacto.");
                    break;
                case 8:
                    System.out.println("Gracias por visitar tu agenda telefonica. Adiós.");
            }

        } while (opcion != 8);
    }

    // Método para mostrar la información de todos los contactos en la agenda
    public static void mostrarAgenda(ArrayList<Contacto> agenda) {
        System.out.println("Agenda Telefónica:");
        for (Contacto contacto : agenda) {
            contacto.mostrarContacto();
        }
    }
}
