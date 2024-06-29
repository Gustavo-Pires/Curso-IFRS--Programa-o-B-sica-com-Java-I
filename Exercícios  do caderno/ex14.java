import java.util.Scanner;

public class ConsumoEnergia {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Calcula o valor de cada quilowatt (um quinto do salário mínimo)
        double valorQuilowatt = salarioMinimo / 5;

        // Solicita ao usuário que insira a quantidade de quilowatts consumida
        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double quilowattsConsumidos = scanner.nextDouble();

        // Calcula o valor a ser pago pela residência (quilowatts consumidos * valor do quilowatt)
        double valorPago = quilowattsConsumidos * valorQuilowatt;

        // Calcula o valor a ser pago com desconto de 15%
        double valorPagoDesconto = valorPago * 0.85;

        // Mostra os resultados
        System.out.println("Valor de cada quilowatt: R$ " + valorQuilowatt);
        System.out.println("Valor a ser pago pela residência: R$ " + valorPago);
        System.out.println("Valor a ser pago com desconto de 15%: R$ " + valorPagoDesconto);

        // Fecha o scanner
        scanner.close();
    }
}
