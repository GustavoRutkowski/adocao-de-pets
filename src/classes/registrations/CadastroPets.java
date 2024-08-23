package classes.registrations;

import java.util.Scanner;
import classes.FerramentasConsole;
import classes.Sistema;
import classes.entities.Pet;
import classes.entities.Usuario;
import interfaces.ICadastro;

public class CadastroPets implements ICadastro {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void carregar() throws Exception {
        FerramentasConsole.escreverTitulo("Cadastro de Pets");

        System.out.print("Digite o nome do Pet: ");
        String nome = sc.nextLine();

        System.out.print("Digite o tipo do Pet (gato/cachorro): ");
        String tipo = sc.nextLine();

        System.out.print("Digite o ano de nascimento do Pet: ");
        int email = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o peso do Pet: ");
        Float peso = sc.nextFloat();
        sc.nextLine();

        System.out.print("O Pet está vacinado? (S/N) ");
        String vacinado = sc.nextLine();
        Boolean estaVacinado = vacinado.equals("S") ? true : false;

        System.out.print("Digite o @nickname do dono do Pet: ");
        String nickDono = sc.nextLine();
        Usuario dono = Sistema.getUsuarioPorNome(nickDono);

        new Pet(nome, tipo, email, peso, estaVacinado, dono);
    };
}
