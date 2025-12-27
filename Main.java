import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){

        ArrayList<Libro> biblioteca = new ArrayList<>();
        
        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de cervantes");
        Libro libro2 = new Libro("El libro troll", "El RubiusOMG");

        biblioteca.add(libro1);
        biblioteca.add(libro2);

        Bibliotecario Manuel = new Bibliotecario(1800, "Organizador de libros", "Manuel", "0001", "872342");
        Socio Santiago = new Socio("Santiago", "0145", "974321");

        System.out.println(biblioteca.get(0).getTitulo());
    }
}
