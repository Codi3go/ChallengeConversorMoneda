import java.util.Map;

public record Moneda(String monedaBase, Map<String, Double> tasasDeCambio) {
}
