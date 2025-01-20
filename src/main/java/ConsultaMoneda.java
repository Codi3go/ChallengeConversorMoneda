import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda obtenerTasasDeCambio(String monedaBase) {

        URI apiEndpoint = URI.create("https://v6.exchangerate-api.com/v6/" +
                "637cd60e2799b7c4ba4eaa41/latest/" + monedaBase);
        HttpClient clienteHttp = HttpClient.newHttpClient();
        HttpRequest solicitudHttp = HttpRequest.newBuilder()
                .uri(apiEndpoint)
                .build();

        HttpResponse<String> respuestaHttp;
        try {
            respuestaHttp = clienteHttp.send(solicitudHttp, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al obtener tasas de cambio", e);
        }

        return new Gson().fromJson(respuestaHttp.body(), Moneda.class);
    }
}
