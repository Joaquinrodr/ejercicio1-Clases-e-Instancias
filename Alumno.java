public class Alumno {

    private String nombre;
    private String apellido;
    private int dniAlumno;

    // CONSTRUCTOR
    public Alumno(String nombreParametro, String apellidoParametro, int dniAlumnoParametro) {

        nombre = nombreParametro;
        apellido = apellidoParametro;
        dniAlumno = dniAlumnoParametro;

    }

    // GETTERS AND SETTERS
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

    public int getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(int dniAlumno) {
        this.dniAlumno = dniAlumno;
    }
}