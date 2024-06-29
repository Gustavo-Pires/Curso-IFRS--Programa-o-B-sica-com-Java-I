import java.util.Scanner;

public class ConversaoMedidas {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma medida em pés
        System.out.print("Digite uma medida em pés: ");
        double pes = scanner.nextDouble();

        // Converte pés para polegadas
        double polegadas = pes * 12;

        // Converte pés para jardas
        double jardas = pes / 3;

        // Converte pés para milhas
        double milhas = jardas / 1760;

        // Mostra os resultados das conversões
        System.out.println(pes + " pés equivalem a:");
        System.out.println(polegadas + " polegadas");
        System.out.println(jardas + " jardas");
        System.out.println(milhas + " milhas");

        // Fecha o scanner
        scanner.close();
    }
}
