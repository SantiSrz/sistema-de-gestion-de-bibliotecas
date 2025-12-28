import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        ArrayList listaSocios = new ArrayList<>();
        ArrayList listaTrabajadores = new ArrayList<>();
        ArrayList listaLibros = new ArrayList<>();


        boolean variable = true;
        Scanner entrada2 = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Opciones de menu:");
        System.out.println(" ");
        System.out.println("1 - Añadir Usuario");
        System.out.println("2 - Añadir Trabajador");
        System.out.println("3 - Añadir Libro");
        System.out.println("4 - Ver todos los libros disponibles");
        System.out.println("5 - Descatalogar Libro");
        System.out.println("6 - Asignar libro a usuario");
        System.out.println("7 - Usuario devuelve el libro");
        System.out.println("8 - SALIR");
        System.out.println(" ");

        while (variable == true){

            System.out.println("Elige tu opcion: ");
            int opcion = entrada2.nextInt();
            entrada2.nextInt();
            entrada2.close();

            if (opcion == 1){

                System.out.println("Usuario: ");
                String usuario = entrada2.nextLine();
                System.out.println("ID: ");
                String IDs = entrada2.nextLine();
                System.out.println("Contraseña: ");
                String contraseñas = entrada2.nextLine();

                Socio nuevoSocio = new Socio(usuario, IDs, contraseñas);
                listaSocios.add(nuevoSocio);
                System.out.println("El socio se ha registrado.");

            }else if(opcion == 2){

                System.out.println("Usuario: ");
                String usuario = entrada2.nextLine();
                System.out.println("ID: ");
                String IDs = entrada2.nextLine();
                System.out.println("Contraseña: ");
                String contraseñas = entrada2.nextLine();
                System.out.println("Salario: ");
                int salarios = entrada2.nextInt();
                System.out.println("Puesto: ");
                String puestos = entrada2.nextLine();

                Bibliotecario nuevoBiblio = new Bibliotecario(salarios, puestos, usuario, IDs, contraseñas);
                listaTrabajadores.add(nuevoBiblio);
                System.out.println("El trabajador se ha registrado.");

            }else if(opcion == 3){
                System.out.println("Titulo: ");
                String titulos = entrada2.nextLine();
                System.out.println("ID: ");
                String autores = entrada2.nextLine();
                System.out.println("Autor: ");

                Libro nuevoLibro = new Libro(titulos, autores);
                listaLibros.add(nuevoLibro);
                System.out.println("Libro añadido.");

            }else if(opcion == 4){

                System.out.println(listaLibros);

            }else if(opcion == 5){
                
                

            }else if(opcion == 6){
                
                prestar();

            }else if(opcion == 7){
                
                devolver();

            }else if(opcion == 8){
                
                variable = false;
            
            }else{

            System.out.println("Opcion no disponible.");

            }
        }
        entrada2.close();
    }
}
