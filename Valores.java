import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        int sub = numero1 - numero2;

        if (soma % 2 == 0 ) {
            System.out.println("O resultado da soma: " + soma);
            System.out.println("O valor " + soma + " é PAR." );           
        } else {
            System.out.println("O resultado da soma: " + soma);
            System.out.println("O valor " + soma + " é ÍMPAR." ); 
        }

            if (sub > 0) {
                System.out.println("\nA diferença entre os números é: " + sub);
                System.out.println("O valor " + sub + " é POSITIVO.");
            } else if (sub < 0) {
                System.out.println("A diferença entre os números é: " + sub);
                System.out.println("O valor " + sub + " é NEGATIVO.");
            } else {
                System.out.println("A diferença entre os números é: " + sub);
                System.out.println("O valor " + sub + " é NULO.");
            }

            sc.close();

    }
    
}
