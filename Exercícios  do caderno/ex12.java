import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o preço de fábrica do veículo
        System.out.print("Digite o preço de fábrica do veículo: ");
        double precoFabrica = scanner.nextDouble();

        // Solicita ao usuário que insira o percentual de lucro do distribuidor
        System.out.print("Digite o percentual de lucro do distribuidor (%): ");
        double percentualLucro = scanner.nextDouble();

        // Solicita ao usuário que insira o percentual de impostos
        System.out.print("Digite o percentual de impostos (%): ");
        double percentualImpostos = scanner.nextDouble();

        // Calcula o valor correspondente ao lucro do distribuidor
        double lucroDistribuidor = precoFabrica * (percentualLucro / 100);

        // Calcula o valor correspondente aos impostos
        double impostos = precoFabrica * (percentualImpostos / 100);

        // Calcula o preço final do produto (preço de fábrica + lucro + impostos)
        double precoFinal = precoFabrica + lucroDistribuidor + impostos;

        // Mostra os resultados
        System.out.println("Valor do lucro do distribuidor: R$ " + lucroDistribuidor);
        System.out.println("Valor dos impostos: R$ " + impostos);
        System.out.println("Preço final do produto: R$ " + precoFinal);

        // Fecha o scanner
        scanner.close();
    }
}
