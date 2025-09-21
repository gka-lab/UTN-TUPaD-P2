
package tp3;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    
    public void ponerHuevo(int cantHuevos) { 
        if (cantHuevos > 0) {
            huevosPuestos += cantHuevos;
        }
    }

    public void envejecer(int anios){
        if (anios > 0) {
            edad += anios;
        }
    }
    
    public int getEdad(){
        return edad;
}
}




// métodos: poner huevo, envejecer, mostrarEdad
// Crear dos gallinas y simular sus acciones (envejecer y poner huevos) y mostrar su estado

