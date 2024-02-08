public class Contacto {

    private String nombre;
    private long numero;
    private int idContacto;
    private static int contadorContactos;

    public Contacto (String nombre, long numero) {
        this.nombre = nombre;
        this.numero = numero;
        Contacto.contadorContactos++;
        this.idContacto = contadorContactos;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void mostrarContacto(){
        System.out.println("Id: "+ idContacto + ", Nombre: " + this.nombre + ", Numero: " + this.numero);
    }

}
