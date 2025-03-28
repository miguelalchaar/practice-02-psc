import java.util.Scanner;

public class Bônus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá Funcionário(a)!\nDigite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu salário atual: ");
        double salarioAtual = sc.nextDouble();

        System.out.println("Digite qual o seu tempo de empresa: ");
        int tempo = sc.nextInt();

        System.out.println("----------------------------");

        System.out.println("**Dados do funcionário:**");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Atual: R$ %.2f\n", salarioAtual);
        System.out.println("Tempo de empresa: " + tempo + " anos");
        
        System.out.println("----------------------------");

        double bonus = 0;

        if (tempo > 10) {
            bonus = salarioAtual * 0.10;
        } else if (tempo > 5) {
            bonus = salarioAtual * 0.05;
        } else {
            System.out.println("Você ainda não possui bônus.");
        }
        
        double salarioFinal = salarioAtual + bonus;

        System.out.printf("Salário Final com Bônus: R$ %.2f", salarioFinal);

        sc.close();

    }
    
}
