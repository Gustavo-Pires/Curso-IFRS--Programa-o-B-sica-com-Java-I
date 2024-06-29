import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        // Calcula a divisão do primeiro número pelo segundo
        double resultado = primeiroNumero / segundoNumero;

        // Mostra o resultado da divisão
        System.out.println("A divisão do primeiro número pelo segundo é: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}
