public class Main {


        public static void main(String[] args) {
            Casa casa = new Casa();

            Habitacion habitacion1 = new Habitacion(1, 24.6);
            Habitacion habitacion2 = new Habitacion(2, 13.3);

            casa.agregarHabitacion(habitacion1);
            casa.agregarHabitacion(habitacion2);

            casa.mostrarInformacionCasa();

            casa.destruirCasa();

            casa.mostrarInformacionCasa();
        }
    }
