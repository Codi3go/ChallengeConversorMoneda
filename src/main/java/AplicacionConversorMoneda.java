import java.util.Scanner;

public class AplicacionConversorMoneda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        int opcion;
        do {
            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
            System.out.println(" |      BIENVENIDO AL CONVERSOR DE MONEDAS        |");
            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
            System.out.println(" 1) USD a ARS\n 2) ARS a USD\n 3) USD a BRL\n 4) BRL a USD\n 5) USD a COP\n 6) COP a USD\n 7) Salir");
            System.out.print(" Seleccione una opción: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print(" Ingrese la cantidad a convertir: ");
                double cantidad = entrada.nextDouble();
                entrada.nextLine();

                String monedaBase = "USD";
                String monedaDestino = "";

                switch (opcion) {
                    case 1 -> monedaDestino = "ARS";
                    case 2 -> {
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                    }
                    case 3 -> monedaDestino = "BRL";
                    case 4 -> {
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                    }
                    case 5 -> monedaDestino = "COP";
                    case 6 -> {
                        monedaBase = "COP";
                        monedaDestino = "USD";
                    }
                }

                Moneda tasas = consultaMoneda.obtenerTasasDeCambio(monedaBase);
                if (tasas != null && tasas.tasasDeCambio().containsKey(monedaDestino)) {
                    double tasaCambio = tasas.tasasDeCambio().get(monedaDestino);
                    double resultado = cantidad * tasaCambio;
                    System.out.printf(" %.2f %s equivale a %.2f %s%n", cantidad, monedaBase, resultado, monedaDestino);
                } else {
                    System.out.println(" No se pudo obtener la tasa de cambio para las monedas seleccionadas.");
                }
            }
        } while (opcion != 7);

        System.out.println(" Gracias por usar el Conversor de Monedas.");
        entrada.close();
    }
}
