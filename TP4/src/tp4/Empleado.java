
package tp4;


public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int cantEmpleados = 0;
    private static int nextId = 1;
    private static final double SALARIO_DEFECTO = 300000.0;

  
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        cantEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_DEFECTO;
        cantEmpleados++;
    }


    public int getId() { return id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }


    public void actualizarSalario(int porcentaje) {
        salario = salario + salario * (porcentaje / 100.0);
    }


    public void actualizarSalario(double montoFijo) {
        salario = salario + montoFijo;
    }

    
    @Override
    public String toString() {
        return "Empleado{id=" + id
                + ", nombre='" + nombre + '\''
                + ", puesto='" + puesto + '\''
                + ", salario=" + salario + "}";
    }

   
    public static int mostrarCantEmpleados() {
        return cantEmpleados;
}
}
