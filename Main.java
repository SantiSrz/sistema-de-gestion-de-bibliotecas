import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        ArrayList<Socio> listaSocios = new ArrayList<>();
        ArrayList<Bibliotecario> listaTrabajadores = new ArrayList<>();
        ArrayList<Libro> listaLibros = new ArrayList<>();

        Libro libro1 = new Libro("Don Qujote de la Mancha", "Miguel de Cervantes");
        Libro libro2 = new Libro("El libro Troll", "ElRubiusOMG");
        Libro libro3 = new Libro("Asi es la puta vida", "JordiWILD");
               
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

        boolean variable = true;
        Scanner entrada2 = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Opciones de menu:");
        System.out.println(" ");
        System.out.println("1 - Añadir Usuario");
        System.out.println("2 - Añadir Trabajador");
        System.out.println("3 - Añadir Libro");
        System.out.println("4 - Ver todos los libros disponibles");
        System.out.println("5 - Ver todos los socios disponibles");
        System.out.println("6 - Descatalogar Libro");
        System.out.println("7 - Eliminar Socio");
        System.out.println("8 - Asignar libro a usuario");
        System.out.println("9 - Usuario devuelve el libro");
        System.out.println("10 - SALIR");
        System.out.println(" ");

        while (variable == true){

            System.out.print("Elige tu opcion: ");
            int opcion = entrada2.nextInt();
            entrada2.nextLine();

            if (opcion == 1){

                System.out.print("Usuario: ");
                String usuario = entrada2.nextLine();
                System.out.print("ID: ");
                String IDs = entrada2.nextLine();
                System.out.print("Contraseña: ");
                String contraseñas = entrada2.nextLine();

                Socio nuevoSocio = new Socio(usuario, IDs, contraseñas);
                listaSocios.add(nuevoSocio);
                System.out.println("El socio se ha registrado.");
                System.out.println(" ");


            }else if(opcion == 2){

                System.out.print("Usuario: ");
                String usuario = entrada2.nextLine();
                System.out.print("ID: ");
                String IDs = entrada2.nextLine();
                System.out.print("Contraseña: ");
                String contraseñas = entrada2.nextLine();
                System.out.print("Salario: ");
                int salarios = entrada2.nextInt();
                entrada2.nextLine();
                System.out.print("Puesto: ");
                String puestos = entrada2.nextLine();

                Bibliotecario nuevoBiblio = new Bibliotecario(salarios, puestos, usuario, IDs, contraseñas);
                listaTrabajadores.add(nuevoBiblio);
                System.out.println("El trabajador se ha registrado.");
                System.out.println(" ");

            }else if(opcion == 3){
                System.out.print("Titulo: ");
                String titulos = entrada2.nextLine();
                System.out.print("ID: ");
                String autores = entrada2.nextLine();
                System.out.print("Autor: ");

                Libro nuevoLibro = new Libro(titulos, autores);
                listaLibros.add(nuevoLibro);
                System.out.println("Libro añadido.");
                System.out.println(" ");

            }else if(opcion == 4){
                if (listaLibros.isEmpty()){
                    System.out.println("No hay libros disponibles.");
                    System.out.println(" ");
                }else{
                    for (int i = 0; i < listaLibros.size(); i++){
                    System.out.println(i + "." + listaLibros.get(i));
                    }
                }
             
            }else if(opcion == 5){
                if (listaSocios.isEmpty()){
                    System.out.println("No hay socios disponibles.");
                    System.out.println(" ");
                }else{
                    for (int i = 0; i < listaSocios.size(); i++){
                    System.out.println(i + "." + listaSocios.get(i));
                    }
                }

            }else if(opcion == 6){
                
                System.out.print("Dime el indice del libro quieres descatalogar: ");
                System.out.println(" ");
                for (int i = 0; i < listaLibros.size(); i++){
                System.out.println(i + "." + listaLibros.get(i));
                }
                int descartar = entrada2.nextInt();
                entrada2.nextLine();
                

                if (descartar >= 0 && descartar < listaLibros.size()){
                    listaLibros.remove(descartar);
                    System.out.println("Libro eliminado de la biblioteca. ");
                    System.out.println(" ");

                }else{
                    System.out.println("Ese inidce de libro no existe. ");
                    System.out.println(" ");
                }

            }else if(opcion == 7){
                
                if (listaSocios.isEmpty()){
                    System.out.println("No hay socios disponibles para borrar.");
                    System.out.println(" ");
                }else{
                    System.out.print("Dime el indice del socio quieres eliminar: ");
                    System.out.println(" ");
                    for (int i = 0; i < listaSocios.size(); i++){
                        System.out.println(i + "." + listaSocios.get(i));
                    }
                    int descartar2 = entrada2.nextInt();
                    entrada2.nextLine();

                    if (descartar2 >= 0 && descartar2 < listaSocios.size()){
                        listaSocios.remove(descartar2);
                    }else{
                    System.out.println("Ese inidice no esta disponible ");
                    System.out.println(" ");
                    }
                }

            }else if(opcion == 8){

                if (listaSocios.isEmpty()){
                    System.out.println("No hay socios disponibles para descartar.");
                    System.out.println(" ");
                }else if (listaLibros.isEmpty()){
                    System.out.println("No hay libros disponibles para prestar al socio.");
                    System.out.println(" ");
                }else{
                    System.out.print("Dime el indice del socio al que hay que prestar el libro: ");
                    System.out.println(" ");
                    for (int i = 0; i < listaSocios.size(); i++){
                        System.out.println(i + "." + listaSocios.get(i));
                    }
                    int prestar = entrada2.nextInt();
                    entrada2.nextLine();

                    System.out.print("Dime el indice del libro que hay que prestar: ");
                    System.out.println(" ");
                    for (int i = 0; i < listaLibros.size(); i++){
                    System.out.println(i + "." + listaLibros.get(i));
                    }
                    int prestar2 = entrada2.nextInt();
                    entrada2.nextLine();

                    if (prestar >= 0 && prestar < listaSocios.size() && prestar2 >= 0 && prestar2 < listaLibros.size()){
                        Socio s = listaSocios.get(prestar);
                        Libro l = listaLibros.get(prestar2);
                        s.prestar(l);
                    }else{
                        System.out.println("Has puesto indices incorrectos");
                        System.out.println(" ");
                    }
                       
                    
                }
                
            }else if(opcion == 9){
                
                if (listaSocios.isEmpty()){
                    System.out.println("No hay socios disponibles para descartar.");
                    System.out.println(" ");
                }else if (listaLibros.isEmpty()){
                    System.out.println("No hay libros disponibles para prestar al socio.");
                    System.out.println(" ");
                }else{
                    System.out.print("Dime el indice del socio que quiere devolver el libro: ");
                    System.out.println(" ");
                    for (int i = 0; i < listaSocios.size(); i++){
                        System.out.println(i + "." + listaSocios.get(i));
                    }
                    int prestar = entrada2.nextInt();
                    entrada2.nextLine();

                    System.out.print("Dime el indice del libro que hay que devolver: ");
                    System.out.println(" ");
                    for (int i = 0; i < listaLibros.size(); i++){
                    System.out.println(i + "." + listaLibros.get(i));
                    }
                    int prestar2 = entrada2.nextInt();
                    entrada2.nextLine();
                     
                    if (prestar >= 0 && prestar < listaSocios.size() && prestar2 >= 0 && prestar2 < listaLibros.size()){
                        Socio s = listaSocios.get(prestar);
                        Libro l = listaLibros.get(prestar2);
                        s.devolver(l);
                    }else{
                        System.out.println("Has puesto indices incorrectos");
                        System.out.println(" ");
                    }    
                }
                
            }else if(opcion == 10){
                
                variable = false;
            
            }else{

            System.out.println("Opcion no disponible.");
            System.out.println(" ");

            }
        }
        entrada2.close();
        System.out.println(" ");
        System.out.println("Programa finalizado.");
        System.out.println(" ");
    }
}
