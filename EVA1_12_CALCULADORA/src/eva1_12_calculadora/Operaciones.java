package eva1_12_calculadora;

public class Operaciones {
    public static int Sumar(int valor1, int valor2){
        int resu;
        resu = valor1 + valor2;
        return resu;
    }
    
    public static int Restar(int valor1, int valor2){
        int resu;
        resu = valor1 - valor2;
        return resu;
    }
    
    public static int Multiplicar(int valor1, int valor2){
        int resu;
        resu = valor1 * valor2;
        return resu;
    }
    
    public static double Dividir(double valor1, double valor2){
        double resu;
        resu = valor1 / valor2;
        return resu;
    }
    
    public static int Potenciar(int valor1, int valor2){
        int resu = 0;
        for(int i =1; i < valor2; i++){
            resu+= valor1 * valor1;
        }
        return resu;
    }
}
