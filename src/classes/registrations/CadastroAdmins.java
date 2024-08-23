package classes.registrations;

import java.util.Scanner;
import interfaces.ICadastro;
import classes.FerramentasConsole;
import classes.Sistema;
import classes.entities.Administrador;
import classes.entities.Usuario;

public class CadastroAdmins implements ICadastro {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void carregar() throws Exception {
        FerramentasConsole.escreverTitulo("Cadastro de Pets");

        System.out.println("Digite o @nickname do usuário promovido a Administrador: ");
        String nickUsuario = sc.nextLine();
        Usuario usuario = Sistema.getUsuarioPorNome(nickUsuario);

        // Garante que o usuário não será duplicado
        Sistema.getUsuarios().remove(usuario);

        new Administrador(
            usuario.getNomeUsuario(),
            usuario.getNome(),
            usuario.getEmail(),
            usuario.getSenha(),
            usuario.getPreferencia(),
            usuario.getDescricao(),
            usuario.getSalario()
        );
    };
}
