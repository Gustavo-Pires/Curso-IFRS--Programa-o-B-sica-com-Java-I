import java.util.Scanner;

public class SalarioComComissao {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o salário fixo
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        // Solicita ao usuário que insira o valor das vendas
        System.out.print("Digite o valor das vendas efetuadas pelo funcionário: ");
        double valorVendas = scanner.nextDouble();

        // Calcula a comissão de 4% sobre o valor das vendas
        double comissao = valorVendas * 4 / 100;

        // Calcula o salário final somando o salário fixo e a comissão
        double salarioFinal = salarioFixo + comissao;

        // Mostra o valor da comissão
        System.out.println("A comissão sobre as vendas é: R$ " + comissao);

        // Mostra o salário final
        System.out.println("O salário final do funcionário é: R$ " + salarioFinal);

        // Fecha o scanner
        scanner.close();
    }
}
