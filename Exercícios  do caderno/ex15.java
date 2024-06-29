import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Calcula a temperatura em Fahrenheit usando a fórmula F = (9 * C / 5) + 32
        double temperaturaFahrenheit = (9 * temperaturaCelsius / 5) + 32;

        // Mostra o resultado da conversão
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + " °F");

        // Fecha o scanner
        scanner.close();
    }
}
