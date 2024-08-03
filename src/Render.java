// import classes.Sistema;
// import classes.browser.Link;
// import classes.browser.Navegador;
// import classes.browser.Pagina;
// import classes.browser.components.Links;
import classes.Sistema;
import classes.entities.Administrador;
import classes.entities.Pet;
import classes.entities.Usuario;
import classes.browser.Pagina;

// Home, Login, Registro, Registro de Pet, Registro de Usuário,

public class Render {
    public static void administradores() {
        String bioGustavo = "Olá, eu sou o Gustavo! Estudante do IFSul, cursando o segundo ano de informática. Sou dono de dois gatos chamados Bart e Maggie.";

        try {
            new Administrador(
                "rutkowskigust_",
                "Gustavo Rutkowski da Silva",
                "rutkowskigustavo@gmail.com",
                "admin1234",
                "ambos",
                bioGustavo,
                0
            );            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };

        String bioBruna = "Olá, eu sou a Bruna! Estudante do IFSul, cursando o segundo ano de informática. Sou dona de uma gatinha chamada Pompom.";

        try {
            new Administrador(
                "ribeirobru_",
                "Bruna Eloise Ribeiro da Silva",
                "ribeirobruna@gmail.com",
                "admin4321",
                "gato",
                bioBruna,
                0
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    };

    public static void pets() {
        Usuario gustavo = Sistema.getUsuarioPorNome("@rutkowskigust_"); 

        new Pet(
            "Bart",
            "gato",
            2023,
            2.1f,
            true,
            gustavo
        );

        new Pet(
            "Maggie",
            "gato",
            2023,
            1.4f,
            true,
            gustavo
        );

        Usuario bruna = Sistema.getUsuarioPorNome("@ribeirobru_");

        new Pet(
            "Pompom",
            "gato",
            2014,
            1.5f,
            true,
            bruna
        );
    };
    
    public static void paginas() {
        try {
            new Pagina("Registro", "./registro");
            new Pagina("Registro de Usuário", "./registro/usuario");
            new Pagina("Registro de Pet", "./registro/pet");
            new Pagina("Login", "./login");
            new Pagina("Início", "./index");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    };
    // Adicionar Componentes de Cada Página...
};
