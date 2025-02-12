package ejercicios_algoritmia;

import java.util.Scanner;

public class Ejercicio1 {
  
    public static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

      
        while (true) {
            System.out.print("Introduzca un número entero: ");
            try {
                num = scanner.nextInt();  // Lee el número entero
                break;  // Si el número es válido, salimos del bucle
            } catch (Exception e) {
                System.out.println("Debe ser un número entero. Intente nuevamente.");
                scanner.next(); // Limpiamos el buffer de la entrada
            }
        }
        return num;
    }

    // Método para imprimir los números pares/impares en orden descendente
    public static void imprimirNumeros(int num) {
        if (num < 0) {
            for (int i = num; i < 1; i += 2) {
                System.out.println(i);
            }
        } else {
            for (int i = num; i >= 0; i -= 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Leer el número y luego imprimir los números en orden descendente
        int num = leerNumero();  // Llamamos al método para leer el número
        imprimirNumeros(num);     // Imprimimos los números correspondientes
    }
}
