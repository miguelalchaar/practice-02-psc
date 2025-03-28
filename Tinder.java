import java.util.Scanner;

public class Tinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Nota para a Altura (0 a 10): ");
        int altura = sc.nextInt();

        System.out.print("Nota para a Beleza (0 a 10): ");
        int beleza = sc.nextInt();

        System.out.print("Nota para o Carisma (0 a 10): ");
        int carisma = sc.nextInt();

        System.out.println("----------------------------");

        System.out.println("Nome: "+ nome + "\nAltura: " + altura + "\nBeleza: " + beleza + "\nCarisma: " + carisma);


        System.out.println("----------------------------");
        

        if (altura > 7 && beleza > 7 && carisma > 7) {
            System.out.println("Booooraa bb!");

        } else if ((altura > 7 && beleza > 7 && carisma <= 7) ||
                   (altura > 7 && carisma > 7 && beleza <= 7) ||
                   (beleza > 7 && carisma > 7 && altura <= 7)) {
            System.out.println("Só vai...");

        } else if ((altura > 7 && beleza <= 7 && carisma <= 7) ||
                   (beleza > 7 && altura <= 7 && carisma <= 7) ||
                   (carisma > 7 && altura <= 7 && beleza <= 7)) {
            System.out.println("Fé em Deus...");
            
        } else {
            System.out.println("Misericórdia");
        }

        sc.close();
    }
    
}
