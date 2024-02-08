import java.util.ArrayList;

public class Contacto
{
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
    public Contacto()
    {

    }

    /**
     * Constructor con los atributos para poder crear el objeto tipo contacto
     * @param nombre
     * @param apellido
     * @param celular
     */
    public Contacto(String nombre, String apellido, String celular)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    /*Getters y Setters*/
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

    public void agregarLista(Contacto contacto)
    {
        listaContactos.add(contacto);
    }


    /**
     * Método para devolver la lista actual de los contactos guardados
     */
    public void listarContactos()
    {
        for (Contacto x: listaContactos)
        {
            System.out.println(x.nombre + " " + x.apellido + " " + x.celular);
        }
    }

    /**
     * @param c Es la cadena completa del contacto que se debe buscar para obtener el index
     *          y al final de la búsqueda borrarlo de la lista
     */
    public void eliminarContacto(Contacto c)
    {
        System.out.println("Ingrese");
        int index = 0;
        for (int i = 0; i < listaContactos.size(); i++) {
            if(String.valueOf(listaContactos.get(i).nombre).equals(c.nombre))
            {
                index = i;
            }
        }
        listaContactos.remove(index);
    }
    public Boolean  existeContacto(String nombre){
        for (Contacto contacto :listaContactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    public String  buscarContacto(String nombre){
        for (Contacto contacto : listaContactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                return contacto.getCelular();
            }
        }
        return "Contacto no existente";
    }
}
