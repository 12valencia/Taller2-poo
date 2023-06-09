public class Universidad {

    private String nombre;
    private Estudiante[] estudiantes;
    private int conta_estudiante;


    //constructor

    public Universidad(String nombre){

        this.nombre = nombre;
        this.estudiantes = new Estudiante[100];
        int conta_estudiante = 0;

    }

    //metodo

    public void agregarEstudiante(Estudiante estudiante) {
        if (conta_estudiante < 100) {
            estudiantes[conta_estudiante] = estudiante;
            conta_estudiante++;
        } else {
            System.out.println("La universidad ya ha alcanzado su capacidad máxima de estudiantes.");
        }
    }
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getCantidadEstudiantes() {
        return conta_estudiante;
    }

    public String getNombre() {
        return nombre;
    }
}
