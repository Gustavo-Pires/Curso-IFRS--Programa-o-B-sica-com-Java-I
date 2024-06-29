import java.util.Scanner;

public class SalarioReceber {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número de horas trabalhadas
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        // Solicita ao usuário que insira o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Calcula o valor da hora trabalhada (um décimo do salário mínimo)
        double valorHora = salarioMinimo / 10;

        // Calcula o salário bruto (horas trabalhadas * valor da hora)
        double salarioBruto = horasTrabalhadas * valorHora;

        // Calcula o imposto (3% do salário bruto)
        double imposto = salarioBruto * 0.03;

        // Calcula o salário a receber (salário bruto - imposto)
        double salarioReceber = salarioBruto - imposto;

        // Mostra os resultados
        System.out.println("Valor da hora trabalhada: R$ " + valorHora);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Salário a receber: R$ " + salarioReceber);

        // Fecha o scanner
        scanner.close();
    }
}
