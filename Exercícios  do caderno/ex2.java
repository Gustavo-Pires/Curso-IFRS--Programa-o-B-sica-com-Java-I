import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        // Solicita ao usuário que insira a segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Solicita ao usuário que insira a terceira nota
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média aritmética das três notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Mostra o resultado da média aritmética
        System.out.println("A média aritmética das três notas é: " + media);

        // Fecha o scanner
        scanner.close();
    }
}
