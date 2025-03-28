import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numeroCorrerto = rd.nextInt(10) + 1;

        System.out.println("---------------------------");
        System.out.println("Tente adivinhar um número de 1 a 10");
        System.out.print("Digite seu palpite: ");
        int palpite = sc.nextInt();
        System.out.println("---------------------------");

        if (palpite == numeroCorrerto) {
            System.out.println("Você acertou, parabéns!");
        } else {
            System.out.println("Poxa, você errou!");
        } if (palpite > numeroCorrerto) {
            System.out.println("Seu palpite foi MAIOR que o número correto.");
            System.out.println("---------------------------");
        } else if (palpite < numeroCorrerto) {
            System.out.println("Seu palpite foi MENOR que o número correto.");
            System.out.println("---------------------------");
        } else {
            System.out.println("---------------------------");
        }

        System.out.println("O número correto era: " + numeroCorrerto);

        sc.close();
    }
    
}
