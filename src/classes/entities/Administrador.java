package classes.entities;

import classes.Sistema;


public class Administrador extends Usuario {
    public Administrador(String nomeUsuario, String nomeCompleto, String email, String senha, String preferencia, String descricaoPerfil, double salario) throws Exception {
        super(
            nomeUsuario,
            nomeCompleto,
            email,
            senha,
            preferencia,
            descricaoPerfil,
            salario
        );

        Sistema.getAdministradores().add(this);
    };

    // Métodos

    public void banirUsuario(Usuario usuario) {
        if (!(usuario instanceof Administrador)) {
            Sistema.getUsuarios().remove(usuario);
        };
    };

    public void editarDescricaoUsuario(Usuario usuario, String novaDescricao) {
        if (!(usuario instanceof Administrador)) {
            usuario.setDescricao(novaDescricao);
        };
    };

    public void editarAnuncio(Anuncio anuncio, String novaDescricao) {
        anuncio.setDescricao(novaDescricao);
    };

    public void removerAnuncio(Anuncio anuncio) {
        anuncio.getAutor().getAnuncios().remove(anuncio);
        Sistema.getAnuncios().remove(anuncio);
    };
};
