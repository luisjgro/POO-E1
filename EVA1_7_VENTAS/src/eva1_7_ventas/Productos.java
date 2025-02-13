package eva1_7_ventas;

public class Productos {
private String nombre;
private String marca;
private double precio;
private String clave;
private int inventario;

//SET AND GET

public void setNombre(String valor){
nombre = valor;
}

public String getNombre(){
return nombre;
}

public void setMarca(String valor){
marca = valor;
}

public String getMarca(){
return marca;
}

public void setPrecio(double valor){
precio = valor;
}

public double getPrecio(){
return precio;
}

public void setClave(String valor){
clave = valor;
}

public String getClave(){
return clave;
}

public void setInventario(int valor){
inventario = valor;
}

public int getInventario(){
return inventario;
}

//Imprimir datos

public void imprimirProductos(){
System.out.println("Marca: " + marca);
System.out.println("Nombre: " + nombre);
System.out.println("Precio: " + precio);
System.out.println("Clave: " + clave);
System.out.println("Productos en el inventario: " + inventario);
}
}
