import java.util.Scanner;
public class Ejercicio8 {
public static void main(String[] args) { 
    double a, r;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el radio de un círculo: ");
    r = scanner.nextDouble();

    a=Math.PI*(r*r); 
    System. out. println("El área de un círculo de radio " +r+ " es: "+a); 
    scanner.close();}
}