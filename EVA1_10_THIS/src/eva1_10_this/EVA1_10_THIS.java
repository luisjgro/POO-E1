/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_this;

/**
 *
 * @author invitado
 */
public class EVA1_10_THIS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
     laptop lap= new laptop();
      Persona persol= new Persona("Javier", "Bernal", 18);
      persol.imprimirDatos();
      
      System.out.println(" ");
      System.out.println("    ");
      lap.imprimirDatos();
      
      
   }
   
  
   
}
 class Persona{
      private String nombre;
      private String apellido;
      private int edad;
      
      public Persona(){
         nombre="Sin Info";
         apellido="Sin Info";
         edad=0;
      }
      
      public Persona(String nombre, String apellido, int edad){
         this.nombre=nombre;
         this.edad=edad;
         this.apellido=apellido;
         
      }
      
      public void setNombre(String nombre){
         this.nombre=nombre;
      }
      
      public String getNombre(){
         return nombre;
      }
      public void setApellido(String apellido){
         this.apellido=apellido;
      }
      
      public String getApellido(){
         return apellido;
      }
      public void setEdad(int edad){
         this.edad=edad;
      }
      
      public String getEdad(){
         return nombre;
      }
      
      public void imprimirDatos(){
         System.out.println(nombre);
         System.out.println(apellido);
         System.out.println(edad);
      }
   }
