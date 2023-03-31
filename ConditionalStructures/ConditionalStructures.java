package ConditionalStructures;

import java.util.Scanner;

public class ConditionalStructures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oclock = scanner.nextInt();

        if (oclock >= 5 && oclock < 12) {
            System.out.println("Bom dia!");
        } else if (oclock >= 12 && oclock <= 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        scanner.close();
    }
}
