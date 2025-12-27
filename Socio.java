public class Socio extends Usuario{

    int librosPrestados;

    public Socio(String nombre, String ID, String contraseña){
        super(nombre, ID, contraseña);
        this.librosPrestados = 0;
    }

    public int getLibrosPrestados(){
        return librosPrestados;
    }
}