
package tp1.introduccion_a_java;

import java.util.Scanner;


public class Ejercicio_5 {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        
            System.out.print("Ingrese un número: ");
            num1 = Integer.parseInt( input.nextLine() );
            
            System.out.print("Ingrese otro número: ");
            num2 = Integer.parseInt( input.nextLine() );
            
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
            System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
}
}
