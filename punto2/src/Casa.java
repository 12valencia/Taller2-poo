public class Casa {
    private Habitacion[] habitaciones;
    private int contadorHabitaciones;
    private static final int CAPACIDAD_MAXIMA = 100;

    public Casa() {
        this.habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        this.contadorHabitaciones = 0;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        if (contadorHabitaciones < CAPACIDAD_MAXIMA) {
            habitaciones[contadorHabitaciones] = habitacion;
            contadorHabitaciones++;
        } else {
            System.out.println("La casa ha alcanzado su capacidad máxima de habitaciones.");
        }
    }

    public void destruirCasa() {
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        contadorHabitaciones = 0;
        System.out.println("La casa ha sido destruida.");
    }

    public void mostrarInformacionCasa() {
        System.out.println("Información de las habitaciones en la casa:");
        for (int i = 0; i < contadorHabitaciones; i++) {
            Habitacion habitacion = habitaciones[i];
            System.out.println("Habitación " + habitacion.getNumero() + ": Tamaño = " + habitacion.getTamano() + " metros cuadrados.");
        }
    }
}
