package eva1_8_constructores;

public class Vehiculo {
    private String marca;
   private String modelo;
   private double precio;
   private int año;
   private String color;       
   
   //CONTRUCTORES - METODOS
   //METODOS: NO TIENEN VALOR DE RETORNO
   //MODIFICADOR DE ACCESO NOMBRE DE LA CLASE (LISTA DE PARAMETROS)
   //CONSTRUCTOR DEFAULT: CONSTRUCTOR SIN PARAMETROS
   public Vehiculo(){
       marca = "SIN MARCA";
       modelo = "SIN MODELO";
       año = 0;
       precio = 0;
       color = "SIN COLOR";
   }
   
   public Vehiculo(String mar, String mod, int y, double pre, String col){
       marca = mar;
       modelo = mod;
       año = y;
       precio = pre;
       color = col;
   }

   public String getMarca(){
      return marca;
   }

   public void setMarca(String valor){
      marca = valor;
   }
   
   public String getModelo(){
      return modelo;
   }

   public void setModelo(String valor){
      modelo = valor;
   }
   
   public String getColor(){
      return color;
   }

   public void setColor(String valor){
      color = valor;
   }
   
   public int getAño(){
      return año;
   }

   public void setAño(int valor){
      año = valor;
   }
   
   public double getPrecio(){
      return precio;
   }
   
   public void setPrecio(double valor){
      precio = valor;
   }

   
   public void imprimirDatos(){
      System.out.println("Datos de vehiculo: ");
      System.out.println("Año: " + año);
      System.out.println("Marca: " + marca);
      System.out.println("Modelo: " + modelo);
      System.out.println("Color: " + color);
      System.out.println("Precio: " + precio);
   }
}
