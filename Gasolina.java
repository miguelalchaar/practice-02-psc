import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de KM percorridos: ");
        double km = sc.nextDouble();

        System.out.println("Digite a quantidade de litros consumidos pelo carro: ");
        double litros = sc.nextDouble();

        double consumo = km / litros;

        if (consumo < 8) {
            System.out.println("Ecônomico!");
        } else if (consumo >= 8 && consumo <= 12) {
            System.out.println("Moderado!");
        } else {
            System.out.println("Eficiente!");
        }
        
        sc.close();
    }
    
}
