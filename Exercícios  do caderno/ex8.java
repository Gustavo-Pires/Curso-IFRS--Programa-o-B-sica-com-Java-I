import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a base do triângulo
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        // Solicita ao usuário que insira a altura do triângulo
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Calcula a área do triângulo
        double area = (base * altura) / 2;

        // Mostra o resultado da área do triângulo
        System.out.println("A área do triângulo é: " + area);

        // Fecha o scanner
        scanner.close();
    }
}
