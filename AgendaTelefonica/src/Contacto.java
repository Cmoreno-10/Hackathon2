import java.util.ArrayList;

public class Contacto {
    /*Atributos de la clas*/
    private String nombre;
    private String apellido;
    private String celular;

    /*Lista tipo contactos*/
    private ArrayList<Contacto> listaContactos = new ArrayList<>(10);


    /**
     * Constructor por defecto para poder acceder a los métodos de la clase, más no asignar
     * valores a la instacia
     */
    public Contacto() {

    }

    /**
     * Constructor con los atributos para poder crear el objeto tipo contacto
     *
     * @param nombre
     * @param apellido
     * @param celular
     */
    public Contacto(String nombre, String apellido, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    /*Getters y Setters*/

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void agregarLista(Contacto nuevoContacto) {
        // Verificar si el nombre ya existe en la lista
        for (Contacto existente : listaContactos) {
            if (existente.getNombre().equalsIgnoreCase(nuevoContacto.getNombre())) {
                System.out.println("El nombre ya existe en la lista. No se agregará el contacto.");
                return;
            }
        }
        // Si el nombre no existe, agregar el contacto a la lista
        listaContactos.add(nuevoContacto);
        System.out.println("Contacto agregado correctamente.\n");
    }

    /**
     * Método para devolver la lista actual de los contactos guardados
     */
    public void listarContactos() {
        for (Contacto x : listaContactos) {
            System.out.println(x.nombre + " " + x.apellido + " " + x.celular + "\n");
        }
    }

    /**
     * @param c Es la cadena completa del contacto que se debe buscar para obtener el index
     *          y al final de la búsqueda borrarlo de la lista
     */
    public void eliminarContacto(Contacto c) {
        int index = 0;
        for (int i = 0; i < listaContactos.size(); i++) {
            if (String.valueOf(listaContactos.get(i).nombre).equals(c.nombre)) {
                index = i;
                break;
            }
        }
        listaContactos.remove(index);
        System.out.println("Señor usuario, el contacto se ha eliminado correctamente!\n");
    }

    public String existeContacto(String nombre) {
        String respuesta = "";
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                respuesta = "El contacto existe: " + contacto.getNombre();
                break;
            } else {
                respuesta = "El contacto no existe";
            }
        }
        return respuesta;
    }

    public String buscarContacto(String nombre) {
        String respuesta = "";
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                respuesta = "El telefono es: " + contacto.getCelular();
                break;
            } else {
                respuesta = "El contacto no se encontró";
            }
        }
        return respuesta;
    }

    /**
     * Clase auxiliar para eliminar el registro ingresado por el usuario.
     *
     * @param apellido que recibe el nombre para devolver un objeto tipo clase Contacto.
     * @return objeto Contacto.
     */
    public Contacto buscarApellido(String apellido) {
        //Instacia de clase que devolvera el contacto con sus atributos correspondientes
        Contacto contactoFinal = new Contacto();
        //Recorre los contactos actuales del arreglo listaContactos
        for (Contacto contacto : listaContactos) {
            //Valida si el apellido se encuentra en la lista de listaContactos
            if (String.valueOf(contacto.getApellido()).equalsIgnoreCase(apellido)) {
                contactoFinal.nombre = contacto.getNombre();
                contactoFinal.apellido = contacto.getApellido();
                contactoFinal.celular = contacto.getCelular();
                break;
            } else {
                contactoFinal.nombre = "";
                contactoFinal.apellido = "";
                contactoFinal.celular = "";
            }
        }
        return contactoFinal;
    }

    public String agendaLlena() {
        if (listaContactos.size() == 10) {
            return "La agenda se encuentra llena. Por favor elimine algún contacto.\n";
        } else {
            return "La agenda aún no se encuentra llena. Puede agregar más contactos.\n";
        }
    }

    public String espaciolibre() {
        int espacioDisponible = 10 - listaContactos.size();
        return "Tiene espacio para agregar " + espacioDisponible + " contactos.\n";
    }
}
