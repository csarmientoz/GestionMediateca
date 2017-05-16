
package Clases;


public abstract class Material implements GestionMediateca {
    
    protected String Titulo;
    protected String Autor;
    protected String Categoria;

    public Material(String Titulo, String Autor, String Categoria) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Categoria = Categoria;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
}
