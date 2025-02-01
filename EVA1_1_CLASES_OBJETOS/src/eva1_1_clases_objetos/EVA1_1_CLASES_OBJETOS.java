package eva1_1_clases_objetos;

public class EVA1_1_CLASES_OBJETOS {

public static void main(String[] args) {
//CREAR UN OBJETO
//INSTANCIA
//Identificador para guardar la direccion de memoria
//variable de un tipo de dato abstracto
Persona perso1;
//asignamos memoria
perso1 = new Persona();
perso1.edad = 18;
perso1.genero = "hombre";
perso1.nombre = "Luis Guerrero";
perso1.imprimirDatos();
    System.out.println(perso1);
}




}
class Persona{
//DATOS - ESTADO - ATRIBUTOS
String nombre;
int edad;
String genero;
//COMPORTAMIENTO
void imprimirDatos(){
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
System.out.println("Genero: " + genero);
}
}