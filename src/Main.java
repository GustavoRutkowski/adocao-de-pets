// import classes.Usuario;
// import classes.Pet;
import classes.browser.Pagina;

public class Main {
    public static void main(String[] args) {
        Pagina registrarUsuario = new Pagina("Registrar Usuário", "");
        Pagina registrarPet = new Pagina("Registrar Pet", "");

        Pagina registro = new Pagina("Registro", "");
        registro.getLinks().add(registrarUsuario);
        registro.getLinks().add(registrarPet);

        registro.mostrarMenu();
    };
};