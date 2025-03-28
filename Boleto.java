import java.util.Scanner;

public class Boleto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do seu  salário bruto: ");
        double salarioBruto = sc.nextDouble();

        double descontoFolha = salarioBruto * 0.125;
        double descontoRef = salarioBruto * 0.06;
        double salarioLiquido = salarioBruto - descontoFolha - descontoRef;

        
        double bolt1, bolt2, bolt3, bolt4, valorTotal;

        System.out.println("Digite o valor do seu 1° boleto: ");
        bolt1 = sc.nextDouble();

        System.out.println("Digite o valor do seu 2° boleto: ");
        bolt2 = sc.nextDouble();

        System.out.println("Digite o valor do seu 3° boleto: ");
        bolt3 = sc.nextDouble();

        System.out.println("Digite o valor do seu 4° boleto: ");
        bolt4 = sc.nextDouble();

        valorTotal = bolt1 + bolt2 + bolt3 + bolt4;

        System.out.println("---------------------------------------");
        System.out.println("____Resumo____");
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto em folha (12,5%%): R$ %.2f\n", descontoFolha);
        System.out.printf("Desconto vale-refeição (6%%): R$ %.2f\n", descontoRef);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
        System.out.printf("Total de boletos: R$ %.2f\n", valorTotal);
        System.out.println("---------------------------------------");

            double saldoFinal = salarioLiquido - valorTotal;

        if (saldoFinal > 0) {
            System.out.printf("Saldo para poupança: R$ %.2f\n", saldoFinal);
        } else if (saldoFinal == 0) {
            System.out.println("Tudo pago, mas to liso!");
        } else {
            System.out.println("Deu ruim!");
        }

        sc.close();
    }
}
