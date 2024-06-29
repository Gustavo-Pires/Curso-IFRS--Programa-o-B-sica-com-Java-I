import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a primeira nota e seu peso
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        // Solicita ao usuário que insira a segunda nota e seu peso
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        // Solicita ao usuário que insira a terceira nota e seu peso
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        // Calcula a soma ponderada das notas
        double somaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);

        // Calcula a soma dos pesos
        double somaPesos = peso1 + peso2 + peso3;

        // Calcula a média ponderada
        double mediaPonderada = somaPonderada / somaPesos;

        // Mostra o resultado da média ponderada
        System.out.println("A média ponderada das notas é: " + mediaPonderada);

        // Fecha o scanner
        scanner.close();
    }
}
