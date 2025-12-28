import java.util.ArrayList;

public class Socio extends Usuario {

    ArrayList<Libro> misPrestados;

    public Socio(String nombre, String ID, String contraseña){
        super(nombre, ID, contraseña);
        this.misPrestados = new ArrayList<>();
    }


    public void prestar(Libro libro){
        if (libro.getDisponibilidad() == true && misPrestados.size() < 3){
            libro.setDisponibilidad(false);
            misPrestados.add(libro);
            System.out.println("Libro prestado a " + getNombre());
        }else if(misPrestados.size() > 3){
            System.out.println("No se te pueden prestar mas libros, has alcanzado el limite de prestaciones.");
        }else if(libro.getDisponibilidad() == false){
            System.out.println("Ese libro no esta disponible.");
        }else{
            System.out.println("No se te puede prestar ese libro por x motivos.");
        }
    }

    public void devolver(Libro libro){
        if (misPrestados.contains(libro)){
            libro.setDisponibilidad(true);
            System.out.println("El libro: " + libro.getTitulo() + ", se ha devuelto.");
        }else{
            System.out.println("No puedes devolver un libro que no tienes.");
        }
    }
}