package classes;
import java.util.ArrayList;

import classes.entities.*;

public class Sistema {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Administrador> administradores = new ArrayList<>();
    private static ArrayList<Pet> pets = new ArrayList<>();
    private static ArrayList<SolicitacaoAdocao> solicitacoes = new ArrayList<>();
    private static ArrayList<Anuncio> anuncios = new ArrayList<>();

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    };

    public static ArrayList<Administrador> getAdministradores() {
        return administradores;
    };

    public static ArrayList<Pet> getPets() {
        return pets;
    };
    
    public static ArrayList<SolicitacaoAdocao> getSolicitacoes() {
        return solicitacoes;
    };

    public static ArrayList<Anuncio> getAnuncios() {
        return anuncios;
    };

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
