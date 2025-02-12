package ejercicios_algoritmia;

import java.util.Scanner;

public class Ejercicio3 {

    public static double calcularSueldo(int horasTrabajadas, double tarifa) {
        double sueldo;
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            sueldo = (40 * tarifa) + (horasExtras * tarifa * 1.5);
        } else {
            sueldo = horasTrabajadas * tarifa;
        }
        return sueldo;
    }

    public static double leerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        while (true) {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(scanner.nextLine());
                if (numero < 0) {
                    System.out.println("El valor no puede ser negativo.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debe ser un número válido.");
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        int horasTrabajadas = (int) leerNumero("Introduzca las horas trabajadas: ");
        double tarifa = leerNumero("Introduzca la tarifa por hora: ");
        double sueldo = calcularSueldo(horasTrabajadas, tarifa);
        System.out.printf("Sueldo: %.2f\n", sueldo);
    }
}

