import java.util.Scanner;

public class Ejercicio11 {                     //Operaciones matemáticas: con Math.pow(), Math.abs() y Math.sqrt();
    public static void main(String[] args) {
        double capital; // Dinero disponible.
        double gastos;  // Dinero que he gastado.
        double ganancias; // Dinero obtenido en el mes.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor con decimales ");
        capital = scanner.nextDouble();
        System.out.println("ingrese el valor con decimales ");
        gastos = scanner.nextDouble();
        System.out.println("Ingrese el valor con decimales");
        ganancias = scanner.nextDouble();

        //Necesito el valor absoluto del error en la factura.
        // si hubo un error en el pago de una factura y le restaron más dinero del correspondiente?
        System.out.println("Ingrese el valor con decimales ");
        double errorFactura = scanner.nextDouble();
        errorFactura = Math.abs(scanner.nextDouble());

        System.out.println("El valor absoluto es " + errorFactura);

        scanner.close();
    }
}
