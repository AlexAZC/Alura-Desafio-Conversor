package exchangeApi;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {



    public CambioDeMoneda resultado(String monedaBase, String monedaObjetivo, double cantidad){

        URI url = URI.create("https://v6.exchangerate-api.com/v6/503fcc403429a68a02ca248c/pair/" + monedaBase + "/" + monedaObjetivo + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        HttpResponse<String> response = null;

        try{
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch(Exception e){
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), CambioDeMoneda.class);

    }





}
