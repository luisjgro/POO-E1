package eva1_4_auto;

public class Vehiculo {
   private String marca;
   private String modelo;
   private double precio;
   private int año;
   private String color;       


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
