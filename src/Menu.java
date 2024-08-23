import java.util.ArrayList;
import java.util.Scanner;
import interfaces.IEntidade;
import classes.FerramentasConsole;
import classes.Sistema;
import classes.registrations.CadastroUsuarios;

public class Menu {
    private Scanner sc;
    private CadastroUsuarios cadastroUsuario;
    // private CadastroPets cadastroPets;
    // private CadastroAdministradores cadastroAdministradores;

    public Menu() {
        this.sc = new Scanner(System.in);
        this.cadastroUsuario = new CadastroUsuarios();
        // this.cadastroPets = new CadastroPets();
        // this.cadastroAdministradores = new CadastroAdministradores();
    }

    public void exibirMenu() throws Exception {
        while (true) {
            FerramentasConsole.limpar();

            FerramentasConsole.escreverTitulo("Menu Principal");

            System.out.println("[1] Cadastrar Usuário");
            System.out.println("[2] Cadastrar Pet");
            System.out.println("[3] Cadastrar Administrador");
            System.out.println("[4] Listar Usuários");
            System.out.println("[5] Listar Pets");
            System.out.println("[6] Listar Administradores");
            System.out.println("[0] Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    FerramentasConsole.limpar();
                    cadastroUsuario.carregar();
                    break;
                case 2:
                    // LimpaTela.limpar();
                    // cadastroPets.carregar();
                    break;
                case 3:
                    // LimpaTela.limpar();
                    // cadastroAdministradores.carregar();
                    break;
                case 4:
                    FerramentasConsole.limpar();

                    ArrayList<IEntidade> usuarios = new ArrayList<>(Sistema.getUsuarios());
                    listarEntidades(usuarios);

                    break;
                case 5:
                    FerramentasConsole.limpar();

                    ArrayList<IEntidade> pets = new ArrayList<>(Sistema.getPets());
                    listarEntidades(pets);

                    break;
                case 6:
                    FerramentasConsole.limpar();

                    ArrayList<IEntidade> admins = new ArrayList<>(Sistema.getAdministradores());
                    listarEntidades(admins);

                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void listarEntidades(ArrayList<IEntidade> entidades) {
        System.out.println();

        for (IEntidade entidade : entidades) {
            entidade.imprimirDados();
            System.out.println();
            System.out.println("-".repeat(50));
            System.out.println();
        }

        System.out.println("Pressione Enter para voltar ao menu...");
        sc.nextLine();
    }
}
