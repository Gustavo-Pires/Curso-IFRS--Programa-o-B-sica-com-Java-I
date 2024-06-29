import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o preço do produto
        System.out.print("Digite o preço do produto: ");
        double precoOriginal = scanner.nextDouble();

        // Calcula o desconto de 10%
        double desconto = precoOriginal * 10 / 100;

        // Calcula o novo preço após o desconto
        double precoNovo = precoOriginal - desconto;

        // Mostra o resultado do novo preço
        System.out.println("O novo preço com desconto de 10% é: R$ " + precoNovo);

        // Fecha o scanner
        scanner.close();
    }
}
