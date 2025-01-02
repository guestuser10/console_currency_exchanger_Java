package com.aluracursos.conversor;
import java.util.Scanner;
import io.github.cdimascio.dotenv.Dotenv;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class CurrencyConverter {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String apiKey = dotenv.get("API_KEY");
    public static final Scanner scanner = new Scanner(System.in);

    public static void dollarToArgentinePeso() {
        System.out.print("Ingrese la cantidad de dolares: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double dollar = scanner.nextDouble();

        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/USD";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "ARS");
            double result = dollar * conversionRate;
            System.out.println("El valor "+ dollar + " [ARS] corresponde al valor final de  =>>> " + result + " 3[ARS]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void argentinePesoToDollar() {
        System.out.print("Ingrese la cantidad de pesos argentinos: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double argentinePeso = scanner.nextDouble();

        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/ARS";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "USD");
            double result = argentinePeso / conversionRate;
            System.out.println("El valor "+ argentinePeso + " [ARS] corresponde al valor final de  =>>> " + result + " [USD]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void dollarToBrazilianReal() {
       System.out.print("Ingrese la cantidad de dolares: ");
       while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double dollar = scanner.nextDouble();

        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/USD";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "BRL");
            double result = dollar * conversionRate;
            System.out.println("El valor "+ dollar + " [USD] corresponde al valor final de  =>>> " + result + " [BRL]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void brazilianRealToDollar() {
        System.out.print("Ingrese la cantidad de reales brasileños: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double brazilianReal = scanner.nextDouble();

        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/BRL";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "USD");
            double result = brazilianReal / conversionRate;
            System.out.println("El valor "+ brazilianReal + "[BRL] corresponde al valor final de  =>>> " + result + " [USD]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void dollarToColombianPeso() {
        System.out.println("Ingrese la cantidad de dolares: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double dollar = scanner.nextDouble();
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/USD";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "COP");
            double result = dollar * conversionRate;
            System.out.println("El valor "+ dollar + " [USD] corresponde al valor final de  =>>> " + result + " [COP]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void colombianPesoToDollar() {
        System.out.println("Ingrese la cantidad de pesos colombianos: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double colombianPeso = scanner.nextDouble();
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/COP";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "USD");
            double result = colombianPeso / conversionRate;
            System.out.println("El valor "+ colombianPeso + " [COP] corresponde al valor final de  =>>>" + result + " [USD]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void dollarToMexicanPeso() {
        System.out.println("Ingrese la cantidad de dolares: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double dollar = scanner.nextDouble();
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/USD";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "MXN");
            double result = dollar * conversionRate;
            System.out.println("El valor "+ dollar + " [USD] corresponde al valor final de  =>>> " + result + " [MXN]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void mexicanPesoToDollar() {
        System.out.println("Ingrese la cantidad de pesos mexicanos: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        double mexicanPeso = scanner.nextDouble();
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/MXN";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();
            java.net.http.HttpResponse<String> response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            double conversionRate = extractConversionRate(response.body(), "USD");
            double result = mexicanPeso / conversionRate;
            System.out.println("El valor "+ mexicanPeso + " [MXN] corresponde al valor final de  =>>> " + result + " [USD]");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    private static double extractConversionRate(String jsonResponse, String currencyCode) {
        try {
            org.json.JSONObject jsonObject = new org.json.JSONObject(jsonResponse);
            org.json.JSONObject conversionRates = jsonObject.getJSONObject("conversion_rates");
            return conversionRates.getDouble(currencyCode);
        } catch (Exception e) {
            System.out.println("Error al extraer la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }

}
