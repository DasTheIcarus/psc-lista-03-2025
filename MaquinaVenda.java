import java.util.Scanner;

public class MaquinaVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra!");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("\nTroco a ser devolvido: R$ " + troco);

            int notas50 = troco / 50;
            troco = troco % 50;
            if (notas50 > 0) {
                System.out.println(notas50 + " nota(s) de R$ 50");
            }
            int notas20 = troco / 20;
            troco = troco % 20;
            if (notas20 > 0) {
                System.out.println(notas20 + " nota(s) de R$ 20");
            }
            int notas10 = troco / 10;
            troco = troco % 10;
            if (notas10 > 0) {
                System.out.println(notas10 + " nota(s) de R$ 10");
            }
            int notas5 = troco / 5;
            troco = troco % 5;
            if (notas5 > 0) {
                System.out.println(notas5 + " nota(s) de R$ 5");
            }

            int notas2 = troco / 2;
            troco = troco % 2;
            if (notas2 > 0) {
                System.out.println(notas2 + " nota(s) de R$ 2");
            }

            int notas1 = troco;
            if (notas1 > 0) {
                System.out.println(notas1 + " nota(s) de R$ 1");
            }
        }

        scanner.close();
    }
}
