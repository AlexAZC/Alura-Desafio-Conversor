

public class MenuDeSistema {

   public String[] monedas = new String[2];


    String pesoArgentino = "ARS",
            boliviano = "BOB",
            realBrasileño = "BRL",
            pesoChileno = "CLP",
            pesoColombiano = "COP",
            dolar = "USD",
            solPeruano = "PEN",
            bolivarVenezolano = "VES",
            euro = "EUR";


    public void ventanaPrincipal(){

        System.out.println("****************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =) \n" +
                "\n" +
                "1) Dólar =>> Peso argentino\n" +
                "2) Peso argentino =>> Dólar\n" +
                "3) Dólar =>> Real brasileño\n" +
                "4) Real brasileño =>> Dólar\n" +
                "5) Dólar =>> Peso colombiano\n" +
                "6) Peso colombiano =>> Dólar\n" +
                "7) Sol peruano =>> Dólar \n" +
                "8) Dólar =>> Sol peruano\n" +
                "9) Bolivar Venezolano =>> Dólar\n" +
                "10) Dólar =>> Bolivar Venezolano\n" +
                "11) Boliviano =>> Dólar\n" +
                "12) Dólar =>> Boliviano\n" +
                "13) Euro =>> Dólar\n" +
                "14) Dólar =>> Euro\n" +
                "15) Peso chileno =>> Dólar\n" +
                "16) Dólar =>> Peso chileno\n" +
                "17) Salir\n" +
                "Elija una opción válida:\n" +
                "****************************************\n"
                );
    }

    public String[] opcionEscogida(int opciones){

        if (opciones == 1){
            monedas[0] = dolar;
            monedas[1] = pesoArgentino;
        } else if (opciones == 2) {
            monedas[0] = pesoArgentino;
            monedas[1] = dolar;
        } else if (opciones == 3) {
            monedas[0] = dolar;
            monedas[1] = realBrasileño;
        } else if (opciones == 4) {
            monedas[0] = realBrasileño;
            monedas[1] = dolar;
        } else if (opciones == 5) {
            monedas[0] = dolar;
            monedas[1] = pesoColombiano;
        } else if (opciones == 6) {
            monedas[0] = pesoColombiano;
            monedas[1] = dolar;
        } else if (opciones == 7) {
            monedas[0] = dolar;
            monedas[1] = solPeruano;
        } else if (opciones == 8) {
            monedas[0] = solPeruano;
            monedas[1] = dolar;
        } else if (opciones == 9) {
            monedas[0] = bolivarVenezolano;
            monedas[1] = dolar;
        } else if (opciones == 10) {
            monedas[0] = dolar;
            monedas[1] = bolivarVenezolano;
        } else if (opciones == 11) {
            monedas[0] = boliviano;
            monedas[1] = dolar;
        } else if (opciones == 12) {
            monedas[0] = dolar;
            monedas[1] = boliviano;
        } else if (opciones == 13) {
            monedas[0] = euro;
            monedas[1] = dolar;
        } else if (opciones == 14) {
            monedas[0] = dolar;
            monedas[1] = euro;
        } else if (opciones == 15) {
            monedas[0] = pesoChileno;
            monedas[1] = dolar;
        } else if (opciones == 16) {
            monedas[0] = dolar;
            monedas[1] = pesoChileno;
        }

        return monedas;

    }

    @Override
    public String toString() {
       return "Quieres cambiar la moneda " + monedas[0] + " a " + monedas[1];
    }

    public void cantidad(){
        System.out.println("Ingrese el valor que deseas convertir:");
    }


}

