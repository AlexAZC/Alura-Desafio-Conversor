import exchangeApi.CambioDeMoneda;
import exchangeApi.Conversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        int opcion;
        double monto;


        Scanner usuario = new Scanner(System.in);
        MenuDeSistema menu = new MenuDeSistema();

        List<CambioDeMoneda> historial = new ArrayList<>();


        while (true){
            /************** MENU-SISTEMA **************/

            menu.ventanaPrincipal();
            opcion = usuario.nextInt();

            if (opcion == 17){
                System.out.println("\n" +
                        "Se le mostrara todas las conversiones realizadas: " +
                        "\n");
                for (CambioDeMoneda valor : historial){
                    System.out.println(valor);
                }
                System.out.println("\n" +
                        "Cerrando sistema..." +
                        "\n");
                break;

            } else {

                menu.opcionEscogida(opcion);
                menu.cantidad();
                monto = usuario.nextDouble();

                /************** API-CONVERSION **************/

                Conversion consultaApi = new Conversion();
                CambioDeMoneda cambioDeMoneda = consultaApi.resultado(menu.monedas[0], menu.monedas[1], monto);
                System.out.println(cambioDeMoneda);
                historial.add(cambioDeMoneda);
            }

        }















    }


}
