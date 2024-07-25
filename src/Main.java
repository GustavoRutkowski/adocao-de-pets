// import classes.Usuario;
// import classes.Pet;
// import classes.browser.Pagina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        System.out.print("Digite a terceira string: ");
        String string3 = scanner.nextLine();

        // Realize o processamento com as strings lidas, se necessário

        // Exiba as strings digitadas
        System.out.println(); // Quebra de linha
        System.out.println("Você digitou as strings:");
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
        System.out.println("String 3: " + string3);

        // Exiba o texto após o espaço de uma linha
        System.out.println("Texto após o espaço de uma linha....");

        scanner.close();
    }
}
