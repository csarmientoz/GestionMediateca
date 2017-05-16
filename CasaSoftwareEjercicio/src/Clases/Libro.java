
package Clases;


public class Libro extends Material {
    private int numPag;
    private int ISBN;
    
    
    public Libro(String Titulo, String Autor, String Categoria, int numPag, int ISBN){
    super(Titulo, Autor, Categoria);
    this.numPag = numPag;
    this.ISBN = ISBN;
    }

   

    public int getNumPag() {
        return numPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String mostrarInventario() {
       return "inventario";
    }

    @Override
    public String mostrarAfiliados() {
       return "Afiliados";
    }

    @Override
    public void buscarPorTitulo() {
        
    }

    @Override
    public void buscarPorAutor() {
       
    }
    
    
}
