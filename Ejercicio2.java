public class Ejercicio2 {

    public static void main(String[] args) {
        int Participantes = 40;
        int Asistencias = 25;
        int Inasistencias = 15;

        Asistencias = Asistencias + Inasistencias;
        Inasistencias = Asistencias - Inasistencias;
        Asistencias = Asistencias - Inasistencias;

        System.out.println("Participantes: " + Participantes);
        System.out.println("Asistencias: " + Asistencias);
        System.out.println("Inasistencias: " + Inasistencias);
    }
    
}
