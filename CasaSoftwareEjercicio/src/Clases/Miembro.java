package Clases;

public class Miembro implements GestionMediateca{

    private String Nombre;
    private String Apellido;
    private String Direccion;

    public Miembro(String Nombre, String Apellido, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String mostrarInventario() {
        return "material";
    }

    @Override
    public String mostrarAfiliados() {
        return "afiliados";
    }

    @Override
    public void buscarPorTitulo() {
        
    }

    @Override
    public void buscarPorAutor() {
       
    }
    
    public void pedirMaterial(){

    }

   

}
