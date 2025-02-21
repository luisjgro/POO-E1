package eva1_11_metodos_estaticos;

public class EVA1_11_METODOS_ESTATICOS {

public static void main(String[] args) {
//double valorAleatorio = Math.random();
//int valor = (int)(Math.random() * 1000);
//System.out.println(valorAleatorio);
//System.out.println(valor);

////perso.mostrarMensaje();

Temperaturas temp = new Temperaturas();
//System.out.println(temp.convertirFaC(100));
System.out.println(Temperaturas.convertirFaC(100));
System.out.println(Temperaturas.convertirCaF(100));
System.out.println(Temperaturas.convertirCaK(100));
System.out.println(Temperaturas.convertirFaK(100));
System.out.println(Temperaturas.convertirKaC(100));
System.out.println(Temperaturas.convertirKaF(100));
}

}