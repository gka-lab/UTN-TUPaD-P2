
package tp3;


public class TP3 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Pedro");
        estudiante.setApellido("Pérez");
        estudiante.setCurso("Programación");
        estudiante.setCalificacion(9);

        estudiante.mostrarInfo();

        System.out.println("\nSubiendo calificación +1...");
        estudiante.subirCalificacion(1);
        estudiante.mostrarInfo();

        System.out.println("\nBajando calificación -3...");
        estudiante.bajarCalificacion(3);
        estudiante.mostrarInfo();

     
        System.out.println("\nNombre del estudiante: " + estudiante.getNombre());
        
        
        Mascota m1 = new Mascota();
        m1.setNombre("Nala");
        m1.setEspecie("Perro");
        m1.setEdad(13);

        m1.mostrarInfo();

        System.out.println("\nCumpliendo años...");
        m1.cumplirAnios();
        m1.mostrarInfo();

        
        Libro libro = new Libro();
        libro.setTitulo("Harry Potter y la piedra filosofal");
        libro.setAutor("J. K. Rowling");

        libro.setAnioPublicacion(3235); // inválido → no cambia
        libro.setAnioPublicacion(1223); // válido

        libro.mostrarInfo();

    }
}