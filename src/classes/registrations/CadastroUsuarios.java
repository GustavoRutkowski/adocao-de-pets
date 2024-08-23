package classes.registrations;

import java.util.Scanner;

import classes.FerramentasConsole;
import classes.entities.Usuario;
import interfaces.ICadastro;

public class CadastroUsuarios implements ICadastro {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void carregar() throws Exception {
        FerramentasConsole.escreverTitulo("Cadastro de Usuários");

        System.out.print("Digite o nome completo do Usuário: ");
        String nomeCompleto = sc.nextLine();

        System.out.print("Digite o nickname do Usuário: ");
        String nomeUsuario = sc.nextLine();

        System.out.print("Digite o email do Usuário: ");
        String email = sc.nextLine();

        System.out.print("Digite a senha do Usuário: ");
        String senha = sc.nextLine();

        System.out.print("Digite a preferência do Usuário (gato/cachorro/ambos): ");
        String preferencia = sc.nextLine();

        System.out.print("Digite a descrição do Usuário: ");
        String descricao = sc.nextLine();

        System.out.print("Digite o salário do Usuário em R$: ");
        Double salario = sc.nextDouble();
        sc.nextLine();

        new Usuario(nomeUsuario, nomeCompleto, email, senha, preferencia, descricao, salario);
    };
}
