
package tp1.introduccion_a_java;

import java.util.Scanner;


public class Ejercicio_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Ejercicio 3
  
        String nombre = "Germán";
        int edad = 30;
        double altura = 1.65;
        boolean estudiante = true;
        String saludo = "Hola " + nombre;
        
        System.out.println(saludo + "!");
        System.out.println("Tenes "+ edad + " anios y medis " + altura + ".");
        System.out.println("¿Es estudiante?: " + estudiante);

    }
}
