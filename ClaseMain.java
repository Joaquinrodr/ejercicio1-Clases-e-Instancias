public class ClaseMain {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Tomas", "Lucia", 4499738);

        Alumno alumno2 = new Alumno("Tatiana", "Becerra", 4434234);

        Docente docente1 = new Docente(43906046, "seba", "mir");

        Asignatura asignatura1 = new Asignatura("POO", "15:00-17:00", "Miercoles");

        // PRUEBAS DE GETTERS
        String nombreAlumno = alumno1.getNombre();
        String apellidoAlumno = alumno1.getApellido();
        String nombreDocente = docente1.getNombre();
        String apellidoDocente = docente1.getApellido();
        String asignaturaNombre = asignatura1.getNombreMateria();
        String diaAsignatura = asignatura1.getDia();
        String horaAsignatura = asignatura1.getHora();

        System.out.println("---------------------------------");
        System.out.println("El nombre del alumno1 es: " + nombreAlumno);
        System.out.println("El apellido del alumno1 es: " + apellidoAlumno);
        System.out.println("El nombre del docente1 es: " + nombreDocente);
        System.out.println("El apellido del docente1 es: " + apellidoDocente);
        System.out.println("El nombre de la asignatura es: " + asignaturaNombre);
        System.out.println("El dia de la asignatura es: " + diaAsignatura);
        System.out.println("La hora de la asignatura es: " + horaAsignatura);

        System.out.println("---------------------------------");
        // PRUEBAS DE SETTERS
        System.out.println("El nombre del alumno2 es: " + alumno2.getNombre());
        alumno2.setNombre("Luna");
        System.out.println("El nuevo nombre del alumno2 es: " + alumno2.getNombre());

    }
}
