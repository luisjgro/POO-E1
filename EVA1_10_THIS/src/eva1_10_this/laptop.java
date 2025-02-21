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
public class laptop {
   private String cpu;
   private String ram;
   private String data;
   private int size;
   private String make;
   private String model;
   
   public laptop(){
    cpu="No info";
  ram="No info";
       data="No info";
     size=0;
     make="No info";
     model="No info";
   }
   
   public laptop(String cpu, String ram, String data, int size, String make, String model){
      this.cpu=cpu;
      this.ram=ram;
      this.data=data;
      this.size=size;
      this.make=make;
      this.model=model;
      
   }
   
   public void setCpu(String cpu){
      this.cpu=cpu;
   }
   
   public String getCpu(){
      return cpu;
   }
   public void setRam(String ram){
      this.ram=ram;
   }
   
   public String getRam(){
      return ram;
   }
   public void setData(String data){
      this.data=data;
   }
   
   public String getData(){
      return data;
   }
   public void setSize(int size){
      this.size=size;
   }
   
   public int getSize(){
      return size;
   }
   public void setMake(String make){
      this.make=make;
   }
   
   public String getMake(){
      return make;
   }
   public void setModel(String model){
      this.model=model;
   }
   
   public String getModel(){
      return model;
   }
   
   public void imprimirDatos(){
      System.out.println(cpu);
      System.out.println(ram);
      System.out.println(data);
      System.out.println(size);
      System.out.println(make);
      System.out.println(model);
   }
   
   
}
