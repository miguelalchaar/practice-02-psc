import java.util.Scanner;

public class Frequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        System.out.println("Digite a frequência do aluno: ");
        double freq = sc.nextDouble();

        if (freq < 0.75) {
            System.out.println("Aluno Reprovado.");       
        } else if (nota >= 7) {
            System.out.println("Parabéns! \nAluno Aprovado.");
        } else if (nota >= 4 || nota < 7) {
            System.out.println("Aluno em Recuperação.");
        } else if (nota < 4) {
            System.out.println("Aluno Reprovado.");
        }

        sc.close();
    }

}