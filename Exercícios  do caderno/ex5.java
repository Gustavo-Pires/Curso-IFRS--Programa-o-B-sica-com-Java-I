import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o salário base
        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        // Calcula a gratificação de 5%
        double gratificacao = salarioBase * 5 / 100;

        // Calcula o salário com a gratificação
        double salarioComGratificacao = salarioBase + gratificacao;

        // Calcula o imposto de 7%
        double imposto = salarioComGratificacao * 7 / 100;

        // Calcula o salário a receber após descontar o imposto
        double salarioAReceber = salarioComGratificacao - imposto;

        // Mostra o resultado do salário a receber
        System.out.println("O salário a receber é: R$ " + salarioAReceber);

        // Fecha o scanner
        scanner.close();
    }
}
