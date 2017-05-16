
package Clases;


public abstract class Media extends Material{
    
    protected double Duracion;
    
    public Media(String Titulo, String Autor, String Categoria, double Duracion) {
        super(Titulo, Autor, Categoria);
        this.Duracion = Duracion;
    }
    
    
}
