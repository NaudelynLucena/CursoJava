import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        
        int asistentes, inasistencias, totalalumnos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, cuantos alumnos han asistido a su clase?");
        asistentes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("cuantos han faltado?");
        inasistencias = scanner.nextInt();
        scanner.nextLine();

        totalalumnos = asistentes + inasistencias;

        System.out.println("Entonces, hay " +totalalumnos+ " alumnos inscritos en su clase.");
        
        scanner.close();
    }
}