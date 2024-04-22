package exchangeApi;

public record CambioDeMoneda(String base_code, String target_code,double conversion_rate,double conversion_result) {



    @Override
    public String toString() {
        double total = conversion_result / conversion_rate;
        return "La conversión del valor " + total + " de moneda " + base_code + " a " + target_code + " es: " + conversion_result;
    }
}
