package eva1_3_modificadores;

public class Persona {
   //ATRIBUTOS
   String nombre;
   String apellidos;
   int edad;
   String genero;
   String curp;
   //CONSTRUCTORES
   //METODOS
   //metodos get y set
   public String getNombre(){
      return nombre;
   }
   
   public void setNombre(String valor){
      nombre = valor;
   }
   
   public String getApellidos(){
      return apellidos;
   }
   
   public void setApellidos(String valor){
      apellidos = valor;
   }
   
   public int getEdad(){
      return edad;
   }
   
   public void setEdad(int valor){
      edad = valor;
   }
   
   public String getGenero(){
      return genero;
   }
   
   public void setGenero(String valor){
      genero = valor;
   }
   
   public String getCurp(){
      return curp;
   }
   
   public void setCurp(String valor){
      curp = valor;
   }
}
