import java.util.Scanner;

public class CirculoeEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o código da operação (1=perímetro, 2=área, 3=volume): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        // Processamento
        switch (operacao) {
            case 1:
                double perimetro = 2 * Math.PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;

            case 2:
                double area = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
                break;

            case 3:
                double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
                break;

            default:
                System.out.println("Código da operação inválido.");
        }

        scanner.close();
    }
}
