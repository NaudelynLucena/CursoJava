import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {

        menuCalculadora();
    }

    public static void menuCalculadora()
    {
        String menu = "Calculadora\n"
                        + "1. sumar\n"
                        + "2. restar\n"
                        + "3. multiplicar\n"
                        + "4. dividir\n"
                        + "5. salir\n"
                        + "\n Ingrese el numero de la operacion que desea realizar", opcion;
        opcion = JOptionPane.showInputDialog(null, menu);

        acciones(opcion);

    }

    public static String ingresoPrimerNumero()
    {
        String numero1 = "Ingrese el primer número";
        String num1 = JOptionPane.showInputDialog(numero1);

        return num1;
    }

    public static String ingresoSegundoNumero()
    {
        String numero2 = "Ingrese el segundo numero";
        String num2 = JOptionPane.showInputDialog(numero2);

        return num2;
    }

    public static void valorInvalido()
    {
        JOptionPane.showMessageDialog(null, "Ha ingresado un numero inválido");
    }

    public static void sumar(String num1, String num2)
    {
        try
        {
            int resultado = Integer.parseInt(num1) + Integer.parseInt(num2);
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
        }
        catch(Exception ex)
        {
            valorInvalido();
        }
        finally
        {
            menuCalculadora();
        }
    }

    public static void restar(String num1, String num2)
    {
        try
        {
            int resultado = Integer.parseInt(num1) - Integer.parseInt(num2);
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
        }
        catch(Exception ex)
        {
            valorInvalido();
        }
        finally
        {
            menuCalculadora();
        }
    }

    public static void multiplicar(String num1, String num2)
    {
        try
        {
            int resultado = Integer.parseInt(num1) * Integer.parseInt(num2);
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + resultado);
        }
        catch(Exception ex)
        {
            valorInvalido();
        }
        finally
        {
            menuCalculadora();
        }
    }

    public static void dividir(String num1, String num2)
    {
        try
        {
            int resultado = Integer.parseInt(num1) / Integer.parseInt(num2);
            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultado);
        }
        catch(Exception ex)
        {
            valorInvalido();
        }
        finally
        {
            menuCalculadora();
        }
    }

    public static void acciones(String opcion)
    {
        String num1,num2;

        switch (opcion)
        {
            case "1":
                num1 = ingresoPrimerNumero();
                num2 = ingresoSegundoNumero();
                sumar(num1, num2);
                break;

            case "2":
                num1 = ingresoPrimerNumero();
                num2 = ingresoSegundoNumero();
                restar(num1, num2);
                break;

            case "3":
                num1 = ingresoPrimerNumero();
                num2 = ingresoSegundoNumero();
                multiplicar(num1, num2);
                break;

            case "4":
                num1 = ingresoPrimerNumero();
                num2 = ingresoSegundoNumero();
                if(num2 == "0")
                {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                    menuCalculadora();
                }
                else{
                dividir(num1, num2);
                }
                break;

            case "5":
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Ha ingresado un valor no válido");
                menuCalculadora();
        }
    }

}