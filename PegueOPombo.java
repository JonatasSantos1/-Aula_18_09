import java.util.Scanner;
import java.util.Random;

public class PegueOPombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sorteio = random.nextInt(10) + 1; // de 0 a 9
        System.out.print("Tente acertar um numero de 1 a 10:  ");
        int chute = scanner.nextInt();
        int contador = 1;
        while (chute != sorteio && contador < 3) {
            System.out.println("tente outra vez");
            chute = scanner.nextInt();
            contador++;
        }

        if (sorteio == chute) {
            System.out.println("Parabens!!! Esta foi com " + contador + " tudo isso.");
        }

        else {
            System.out.println(" Nao foi desta vez");
        }

    }
}
