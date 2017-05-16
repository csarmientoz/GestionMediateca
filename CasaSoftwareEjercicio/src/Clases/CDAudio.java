
package Clases;


public class CDAudio extends Media {
    private String Genero;
    private String[] Musicos;

    public CDAudio(String Titulo, String Autor, String Categoria, double Duracion, String Genero, String[] Musicos) {
        super(Titulo, Autor, Categoria,Duracion);
        this.Genero = Genero;
        this.Musicos = Musicos;
    }

    public String getGenero() {
        return Genero;
    }

    public String[] getMusicos() {
        return Musicos;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setMusicos(String[] Musicos) {
        this.Musicos = Musicos;
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
