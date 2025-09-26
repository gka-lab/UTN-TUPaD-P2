
package tp4;

public class TP4 {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(101, "Luke Skywalker", "Limpieza", 150000);
        Empleado e2 = new Empleado("Anakin Skywalker", "Cocinero");
        Empleado e3 = new Empleado("Obi-Wan Kenobi", "Bachero");

        e1.actualizarSalario(15);        
        e2.actualizarSalario(22000.0);   
        e3.actualizarSalario(10);        
        e3.actualizarSalario(10000.0);   

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total empleados: " + Empleado.mostrarCantEmpleados());
        
    }

}
