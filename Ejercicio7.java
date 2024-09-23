import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int inasistenciasDía1, inasistenciasDía2, clasesSemana, totalInasistencias;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el numero de clases por semana");
        clasesSemana = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingrese el numero de inasistencias del día 1");
        inasistenciasDía1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingrese el numero de inasistencias del día 2");
        inasistenciasDía2 = scanner.nextInt();
        scanner.nextLine();

        totalInasistencias = (inasistenciasDía1 + inasistenciasDía2) * clasesSemana;

        System.out.println("Entonces, hubo " +totalInasistencias+ " inasistencias en la semana.");
        
        scanner.close();

    }
}
