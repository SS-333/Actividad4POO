package Personas;
public class Persona {
    protected String id;
    protected String nombre;
    protected String apellidos;
    protected String telefono;
    protected String direccion;

    public Persona(String id,String nombre, String apellidos,
                   String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
