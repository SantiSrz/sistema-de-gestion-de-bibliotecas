public class Bibliotecario extends Usuario {

    private int salario;
    private String puesto;

    public Bibliotecario(int salario, String puesto, String nombre, String ID, String contraseña){
        super(nombre, ID, contraseña);
        this.salario = salario;
        this.puesto = puesto;
    }

    public int getSalario(){
        return salario;
    }
    public String getPuesto(){
        return puesto;
    }
}
