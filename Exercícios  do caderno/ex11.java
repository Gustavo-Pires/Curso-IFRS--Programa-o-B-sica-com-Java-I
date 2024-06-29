import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual (pode ser informado manualmente para teste)
        int anoAtual = 2024; // Coloque aqui o ano atual

        // Calcula a idade em anos
        int idadeAnos = anoAtual - anoNascimento;

        // Calcula a idade em meses
        int idadeMeses = idadeAnos * 12;

        // Calcula a idade em dias (considerando anos de 365 dias)
        int idadeDias = idadeAnos * 365;

        // Calcula a idade em semanas (considerando anos de 52 semanas)
        int idadeSemanas = idadeAnos * 52;

        // Mostra os resultados
        System.out.println("Idade em anos: " + idadeAnos);
        System.out.println("Idade em meses: " + idadeMeses);
        System.out.println("Idade em dias: " + idadeDias);
        System.out.println("Idade em semanas: " + idadeSemanas);

        // Fecha o scanner
        scanner.close();
    }
}
