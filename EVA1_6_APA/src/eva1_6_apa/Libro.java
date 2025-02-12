package eva1_6_apa;

public class Libro {
    private String autor;
    private String titulo;
    private String ciudad;
    private String editorial;
    private int año;
    //GET Y SET
    
    public void setAutor(String valor){
        autor = valor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setTitulo(String valor){
        titulo = valor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setCiudad(String valor){
        ciudad = valor;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setEditorial(String valor){
        editorial = valor;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setAño(int valor){
        año = valor;
    }
    
    public int getAño(){
        return año;
    }
    
    public void imprimirDatos(){
        System.out.println(autor + " (" + año + "). " + titulo + ", " + ciudad + ", " + editorial + ".");
    }
}
