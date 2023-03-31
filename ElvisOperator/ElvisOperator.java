package ElvisOperator;
import java.util.Scanner;

public class ElvisOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do ventilador e o programa retornará se é caro ou barato: ");
        int value = scanner.nextInt();

        System.out.println(value <= 100 ? "Barato" : "Caro");

        scanner.close();
    }
}
