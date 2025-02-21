package eva1_5_tv;

import java.util.Scanner;

public class Tv {
   private boolean encendido;
   private int volumen;
   private int canal = 1;
   
   public void enderApagar(){
        if(encendido==true){
            encendido=false;
        }else{
            encendido=true;
        }
    }
    
    public void imprimirDatos(){
        Scanner cap = new Scanner(System.in);
        if (encendido==true){
            System.out.println("tv prendida");
            
            
        }else{
            System.out.println("tv apagada");
        }
        System.out.println("Volumen:"+volumen);
       
    }
    
    public void subirVolumen(){
   
        if (encendido==true){
        if(volumen>0&&volumen<100){
           volumen+=1;
     }else{
         System.out.println("No se puede aumentar el volumen");
     }
        
        }
    
}
    public void bajarVolumen(){
        if(encendido==true){
        if(volumen>0&&volumen<100){
           volumen-=1;
     }else{
         System.out.println("No se puede aumentar el volumen");
         volumen=0;
     }
        }  
    
}
    
    public void setCanal (int valor){
       canal = valor;
    }
    
    public void subirCanal(int valor){
       if (encendido == true){
          if(canal == 10)
             canal = 0;
          else 
             canal +=1;
        }
    }
    
    public void bajarCanal(){
       if (encendido == true){
          if(canal == 0)
             canal = 10;
          else 
             canal -=1;
       }
    }
     
}
