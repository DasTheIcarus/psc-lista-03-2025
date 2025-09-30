import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();
    
        double maior = n1;
        if (n2 > maior){
            maior = n2;
        } 
        if (n3 > maior){
            maior = n3;
        }
        double menor = n1;
        if (n2 < menor){
             menor = n2;
        }
        if (n3 < menor){
            menor = n3;
        }

        double media = (n1 + n2 + n3) / 3.0;
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}