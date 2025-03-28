import java.util.Scanner;

public class Prestacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o valor da prestação mensal: ");
        double prestacao = sc.nextDouble();

        double limite = salario * 0.30;

        if (prestacao <= limite) {
            System.out.println("Financiamento foi APROVADO!");
        } else {
            System.out.println("Financiamento REPROVADO! \nO valor da ultrapassou seu salário.");
        }
        
        sc.close();
    }
    
}
