package exchangeApi;

public record CambioDeMoneda(double conversion_result) {


    @Override
    public String toString() {
        return "La conversión de moneda es: " + conversion_result;
    }
}
