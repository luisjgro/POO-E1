package eva1_8_constructores;

public class EVA1_8_CONSTRUCTORES {

    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("FORD", "MUSTANG", 1970, 1000000, "ROJO");
        
        carro.imprimirDatos();
         Vehiculo otroCarro = new Vehiculo();
         otroCarro.imprimirDatos();
    }
    
}
