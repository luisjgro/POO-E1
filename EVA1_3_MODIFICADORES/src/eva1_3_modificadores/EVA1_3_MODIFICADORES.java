package eva1_3_modificadores;

public class EVA1_3_MODIFICADORES {

   public static void main(String[] args) {
      //INSTANCIAR UN OBJETO
      //CLASE IDENTIFICADOR = new CONSTRUCTOR(PARAMETROS);
      Persona perso = new Persona();
      perso.setNombre("Luis Javier");
      System.out.println("Nombre: " + perso.getNombre());
      perso.setApellidos("Guerrero Arellano");
      System.out.println("Apellidos: " + perso.getApellidos());
      perso.setEdad(18);
      System.out.println("Edad: " + perso.getEdad());
      perso.setGenero("Hombre");
      System.out.println("Genero: " + perso.getGenero());
      perso.setCurp("GUAL060919HCHRRSA1");
      System.out.println("CURP: " + perso.getCurp());
      
   }
   
}
