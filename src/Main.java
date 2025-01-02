import com.aluracursos.conversor.CurrencyConverter;

import static com.aluracursos.conversor.CurrencyConverter.scanner;

public class Main {
    public static void main(String[] args) {

        String menu = """
                ****************************************************
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                7) Dolar =>> Peso Mexicano
                8) Peso Mexicano =>> Dolar
                9) Salir
                ****************************************************
                """;

        while (true) {
            System.out.println(menu);
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese una opcion valida.");
                scanner.next();
            }
            int option = scanner.nextInt();
            if (option == 9) {
                break;
            }
            switch (option) {
                case 1:
                    CurrencyConverter.dollarToArgentinePeso();
                    break;
                case 2:
                    CurrencyConverter.argentinePesoToDollar();
                    break;
                case 3:
                    CurrencyConverter.dollarToBrazilianReal();
                    break;
                case 4:
                    CurrencyConverter.brazilianRealToDollar();
                    break;
                case 5:
                    CurrencyConverter.dollarToColombianPeso();
                    break;
                case 6:
                    CurrencyConverter.colombianPesoToDollar();
                    break;
                case 7:
                    CurrencyConverter.dollarToMexicanPeso();
                    break;
                case 8:
                    CurrencyConverter.mexicanPesoToDollar();
                    break;
                default:
                    System.out.println("Elige una opción válida");
            }
        }
        System.out.println(menu);
    }
}