import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String ID;
    private String contraseña;

    public Usuario(String nombre, String ID, String contraseña){
        this.nombre = nombre;
        this.ID = ID;
        this.contraseña = contraseña;
    }

    public String getNombre(){
        return nombre;
    }
    public String getID(){
        return ID;
    }
    public String getcontraseña(){
        return contraseña;
    }

    public String toString() {
        return "Usuario: " + nombre + " [ID: " + ID + "]";
    }

}