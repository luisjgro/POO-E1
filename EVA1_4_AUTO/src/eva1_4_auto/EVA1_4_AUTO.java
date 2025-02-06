package eva1_4_auto;

public class EVA1_4_AUTO {

   public static void main(String[] args) {
      Vehiculo auto = new Vehiculo();
      
      auto.setAño(2024);
      auto.setMarca("Ford");
      auto.setModelo("Mustang");
      auto.setColor("Black");
      auto.setPrecio(250000);
      System.out.println(auto.getAño() + " " + auto.getMarca() +
              " " + auto.getModelo() + " (" + auto.getColor() + ") " + "$" + auto.getPrecio());
      
      auto.imprimirDatos();
      }
   
}
