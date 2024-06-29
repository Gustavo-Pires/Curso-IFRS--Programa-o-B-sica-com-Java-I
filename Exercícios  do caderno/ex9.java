import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o valor do lado do quadrado
        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        // Calcula a área do quadrado usando a fórmula lado^2
        double area = lado * lado;

        // Mostra o resultado da área do quadrado
        System.out.println("A área do quadrado é: " + area);

        // Fecha o scanner
        scanner.close();
    }
}
