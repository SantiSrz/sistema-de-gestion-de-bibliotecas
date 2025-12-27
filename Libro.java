public class Libro {
    
    private String titulo;
    private String autor;
    private boolean disponibilidad;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = true;
    }

    public String toString(){
        return "El libro se titula: " + titulo + ", y esta escrito por: " + autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean getDisponibilidad(){
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponible) {
    this.disponibilidad = disponible;
    }

}
