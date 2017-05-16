
package Clases;



public class DVD extends Media {
    private String[] actores;

    public DVD(String Titulo, String Autor, String Categoria, double Duracion, String[] actores) {
        super(Titulo, Autor, Categoria, Duracion);
        this.actores = actores;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    @Override
    public String mostrarInventario() {
        return "inventario";
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
    
    
    
    
    
    
    
}
