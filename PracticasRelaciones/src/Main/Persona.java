
package Main;

public class Persona {
    
    private String nombre;
    private String apellido;
    private PersonaDni dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, PersonaDni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    public PersonaDni getDni() {
        return dni;
    }

    public void setDni(PersonaDni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
    
}
