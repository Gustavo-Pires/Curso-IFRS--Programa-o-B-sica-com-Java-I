import java.util.Scanner;

public class CalculaMediaAluno {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declarar as variáveis
        double N1, N2, N3, N4, SOMA, MEDIA;

        // Solicitar as notas ao usuário
        System.out.print("Informe a primeira nota: ");
        N1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        N2 = scanner.nextDouble();

        System.out.print("Informe a terceira nota: ");
        N3 = scanner.nextDouble();

        System.out.print("Informe a quarta nota: ");
        N4 = scanner.nextDouble();

        // Calcular a soma e a média das notas
        SOMA = N1 + N2 + N3 + N4;
        MEDIA = SOMA / 4;

        // Exibir a média final
        System.out.println("A média final é: " + MEDIA);

        // Fechar o scanner
        scanner.close();
    }
}
