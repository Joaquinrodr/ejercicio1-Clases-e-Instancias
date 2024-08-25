public class Docente {
    private int dniDocente;
    private String nombre;
    private String apellido;

    public Docente(int dniDocente, String nombre, String apellido) {
        this.dniDocente = dniDocente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDniDocente() {
        return dniDocente;
    }

    public void setDniDocente(int dniDocente) {
        this.dniDocente = dniDocente;
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

}