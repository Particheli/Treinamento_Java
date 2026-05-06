package tecnoguru;

import java.util.Scanner; // Importa Scanner para entrada de dados

public class ParcelasCompra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorTotal = sc.nextDouble(); // Valor total da compra

        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = sc.nextInt(); // Número de parcelas

        double valorParcela = valorTotal / parcelas; // Calcula valor de cada parcela

        // Loop for: usado quando sabemos exatamente quantas repetições teremos
        for (int i = 1; i <= parcelas; i++) {
            // i representa o número da parcela

            System.out.println("Parcela " + i + ": R$ " + valorParcela);
        }

        sc.close(); // Fecha o Scanner
    }
}