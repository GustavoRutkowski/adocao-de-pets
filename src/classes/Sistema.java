package classes;
import java.util.ArrayList;

import classes.entities.*;

public class Sistema {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Administrador> administradores = new ArrayList<>();
    public static ArrayList<Pet> pets = new ArrayList<>();
    public static ArrayList<SolicitacaoAdocao> solicitacoes = new ArrayList<>();
    public static ArrayList<Anuncio> anuncios = new ArrayList<>();

    public static Usuario getUsuarioPorNome(String nome) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            
            if (usuario.getNomeUsuario().equals(nome)) {
                return usuario;
            };
        };

        return null;
    };
};
