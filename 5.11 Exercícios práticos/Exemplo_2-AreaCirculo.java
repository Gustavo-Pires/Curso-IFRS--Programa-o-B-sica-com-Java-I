import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declarar variáveis
        double raio, area;
        final double PI = 3.14159;
        
        // Ler o raio do usuário
        System.out.print("Digite o raio do círculo: ");
        raio = input.nextDouble();
        
        // Calcular a área
        area = PI * raio * raio;
        
        // Mostrar o resultado
        System.out.println("A área do círculo é: " + area);
        
        input.close();
    }
}
