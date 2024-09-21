import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, como se llama tu mascota?");
        String nombre = scanner.nextLine();

        System.out.println("Que edad tiene su mascota");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("cuanto pesó la última vez(introduzca con decimales)");
        float peso = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Hemos abierto el historial de su mascota, su nombre es " + nombre);
        System.out.println("tiene " +edad + " años");
        System.out.println("y pesa " +peso + " kilogramos. En breve le atenderemos.");

        scanner.close();
    }
}
