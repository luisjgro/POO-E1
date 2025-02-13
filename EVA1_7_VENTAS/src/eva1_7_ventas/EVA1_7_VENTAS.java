package eva1_7_ventas;

public class EVA1_7_VENTAS {

    public static void main(String[] args) {
        Productos produ = new Productos();
        
        produ.setNombre("Mayonesa");
        produ.setMarca("Mc Cormick");
        produ.setPrecio(79.99);
        produ.setClave("MAMC2025");
        produ.setInventario(5);
        //IMPRIMIR
        produ.imprimirProductos();
    }
    
}
