package tp3;

import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo(){ 
        return titulo; 
    }
    public String getAutor(){
        return autor;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnioPublicacion(int anio) {
        int actual = Year.now().getValue();
        if (anio >= 1500 && anio <= actual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año inválido: " + anio + ". Debe estar entre 1500 y " + actual + ".");
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anioPublicacion);
    }
}