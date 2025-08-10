
package tp1.introduccion_a_java;

import java.util.Scanner;

public class Ejercicio_4 {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        String nombre;
        int edad;        
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        String saludo = "Hola " + nombre;
        
        System.out.println(saludo + "!");
        System.out.println("Tenes "+ edad + " anios.");
    
            }
}
