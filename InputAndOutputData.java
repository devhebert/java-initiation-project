import java.util.Scanner;

public class InputAndOutputData {
    public static void main(String[] args) {
        //saida de dados//
        System.out.println("Famoso Hello World!");

        int someInteger = 10;

        System.out.println(someInteger);


        //entrada de dados//
        Scanner scanner = new Scanner(System.in);

        String someText = scanner.next();
        int anotherInteger = scanner.nextInt();
        double anyNumberSeparatedByCommaOrDot = scanner.nextDouble();
        char firstCharacterOfText = scanner.next().charAt(0);

        System.out.println("Você digitou: " + someText + ", " + anotherInteger + ", " + anyNumberSeparatedByCommaOrDot + ", " + firstCharacterOfText);
    }
}
