import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){

        ArrayList<Libro> biblioteca = new ArrayList<>();
        
        Bibliotecario Manuel = new Bibliotecario(1800, "Organizador de libros", "Manuel", "0001", "872342");

        Libro quijote = new Libro("Don Quijote", "Cervantes");
        Socio santiago = new Socio("Santiago", "ID-01", "1234");

        santiago.prestar(quijote); 

        santiago.prestar(quijote);

        santiago.devolver(quijote);

        santiago.prestar(quijote);
    }
}
