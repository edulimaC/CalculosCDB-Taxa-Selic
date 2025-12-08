import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoInvestimentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.printf("%nDigite o valor a ser calculado: ");
        double valor = sc.nextDouble();

        System.out.printf("Digite o tempo de aplicação em dias: ");
        int tempo = sc.nextInt();

        System.out.printf("%nDigite o tipo de investimento, 1-CDB 2-TAXA-SELIC: ");
        int type = sc.nextInt();

        double IR, conta1, contaFinal, taxaAnualCdb, taxa, taxaDiaria;

        if (type == 1) {
            System.out.printf("%nDigite a porcentagem do CDB: ");
            int cdb = sc.nextInt();
            taxa = cdb / 100.0;
            taxaAnualCdb = (14.90 * taxa) / 100.0;
            conta1 = valor * taxaAnualCdb * tempo / 252;
            System.out.println("\nRendimento bruto: " + df.format(conta1));

            if (tempo <= 180) {
                IR = conta1 * 0.225;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            } else if (tempo <= 360 && tempo >= 181) {
                IR = conta1 * 0.20;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            } else if (tempo >= 361 && tempo <= 720) {
                IR = conta1 * 0.175;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            } else {
                IR = conta1 * 0.15;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            }
        } else {
            taxa = 0.15;
            taxaDiaria = Math.pow(1 + taxa, 1.0 / 252) - 1;
            conta1 = valor * (Math.pow(1 + taxaDiaria, tempo) - 1);
            System.out.println("\nRendimento bruto: " + df.format(conta1));

            if (tempo <= 180) {
                IR = conta1 * 0.225;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            } else if (tempo <= 360 && tempo >= 181) {
                IR = conta1 * 0.20;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            } else if (tempo >= 361 && tempo <= 720) {
                IR = conta1 * 0.175;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            } else {
                IR = conta1 * 0.15;
                contaFinal = conta1 - IR;
                System.out.println("Valor total com impostos: " + df.format(contaFinal));
            }
        }
    }
}