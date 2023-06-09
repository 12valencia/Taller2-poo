public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Universidad universidad = new Universidad("Universidad XYZ");

        Estudiante estudiante1 = new Estudiante("Daniel flores", 25, 1);
        Estudiante estudiante2 = new Estudiante("Valentina Valencia", 25, 2);

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        System.out.println("Nombre de la universidad: " + universidad.getNombre());

        Estudiante[] estudiantes = universidad.getEstudiantes();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Edad: " + estudiante.getEdad());
                System.out.println("Número de estudiante: " + estudiante.getNumero_estudiante());
                System.out.println("-------------------");
            }
        }
    }
}