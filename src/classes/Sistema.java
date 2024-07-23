package classes;
import java.util.ArrayList;

import classes.entities.*;

public class Sistema {
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Administrador> administradores;
    public static ArrayList<Pet> pets;
    public static ArrayList<SolicitacaoAdocao> solicitacoes;
    public static ArrayList<Anuncio> anuncios;

    public Sistema() {
        usuarios = new ArrayList<>();
        administradores = new ArrayList<>();
        pets = new ArrayList<>();
        solicitacoes = new ArrayList<>();
        anuncios = new ArrayList<>();
    };
};
