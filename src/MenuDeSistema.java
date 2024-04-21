import java.util.Scanner;

public class MenuDeSistema {

    int opcion;
    int monto;

    Scanner usuario = new Scanner(System.in);

    String pesoArgentino = "ARS",
            boliviano = "BOB",
            realBrasileño = "BRL",
            pesoChileno = "CLP",
            pesoColombiano = "COP",
            dolar = "USD",
            solPeruano = "PEN",
            bolivarVenezolano = "VES",
            euro = "EUR";





    public String[] ventanaPrincipal(){

        String[] monedas = new String[2];

        System.out.println("****************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =) \n" +
                "\n" +
                "1) Dólar =>> Peso argentino\n" +
                "2) Peso argentino =>> Dólar\n" +
                "3) Dólar =>> Real brasileño\n" +
                "4) Real brasileño =>> Dólar\n" +
                "5) Dólar =>> Peso colombiano\n" +
                "6) Peso colombiano =>> Dólar\n" +
                "7) Dólar =>> Peso colombiano\n" +
                "8) Sol peruano =>> Dólar \n" +
                "9) Dólar =>> Sol peruano\n" +
                "10) Bolivar Venezolano =>> Dólar\n" +
                "11) Dólar =>> Bolivar Venezolano\n" +
                "12) Boliviano =>> Dólar\n" +
                "13) Dólar =>> Boliviano\n" +
                "14) Euro =>> Dólar\n" +
                "15) Dólar =>> Euro\n" +
                "16) Peso chileno =>> Dólar\n" +
                "17) Dólar =>> Peso chileno\n" +
                "18) Salir\n" +
                "Elija una opción válida:\n" +
                "****************************************\n" +
                "\n");

        opcion = usuario.nextInt();

        if (opcion == 1){
            monedas[0] = dolar;
            monedas[1] = pesoArgentino;
        } else if (opcion == 2) {
            monedas[0] = pesoArgentino;
            monedas[1] = dolar;
        } else if (opcion == 3) {
            monedas[0] = dolar;
            monedas[1] = realBrasileño;
        } else if (opcion == 3) {
            monedas[0] = realBrasileño;
            monedas[1] = dolar;
        } else if (opcion == 3) {
            monedas[0] = dolar;
            monedas[1] = pesoColombiano;
        } else if (opcion == 3) {
            monedas[0] = pesoColombiano;
            monedas[1] = dolar;
        } else if (opcion == 3) {
            monedas[0] = dolar;
            monedas[1] = solPeruano;
        } else if (opcion == 3) {
            monedas[0] = solPeruano;
            monedas[1] = dolar;
        } else if (opcion == 3) {
            monedas[0] = dolar;
            monedas[1] = bolivarVenezolano;
        } else if (opcion == 3) {
            monedas[0] = bolivarVenezolano;
            monedas[1] = dolar;
        } else if (opcion == 3) {
            monedas[0] = dolar;
            monedas[1] = boliviano;
        } else if (opcion == 3) {
            monedas[0] = boliviano;
            monedas[1] = dolar;
        } else if (opcion == 3) {
            monedas[0] = dolar;
            monedas[1] = euro;
        } else if (opcion == 3) {
            monedas[0] = euro;
            monedas[1] = dolar;
        } else if (opcion == 3) {
            monedas[0] = dolar;
            monedas[1] = pesoChileno;
        } else if (opcion == 3) {
            monedas[0] = pesoChileno;
            monedas[1] = dolar;
        }

    return monedas;

    }

    public void cantidad(){
        System.out.println("Ingrese el valor que deseas convertir:");
        monto = usuario.nextInt();
    }

}
