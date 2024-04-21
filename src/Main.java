import exchangeApi.CambioDeMoneda;
import exchangeApi.Conversion;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        MenuDeSistema menu = new MenuDeSistema();



        List<CambioDeMoneda> historial = new ArrayList<>();
        do {

            /************** API-CONVERSION **************/

            Conversion consultaApi = new Conversion();
            CambioDeMoneda cambioDeMoneda = consultaApi.resultado("EUR", "PEN", 25);
            historial.add(cambioDeMoneda);

        }
        while (opcion > 0 && opcion < 19);










    }


}
