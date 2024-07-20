package classes;

public class Administrador extends Usuario {
    public Administrador(String nomeUsuario, String nomeCompleto, String email, String senha, String preferencia, String descricaoPerfil, double salario) {
        super(
            nomeUsuario,
            nomeCompleto,
            email,
            senha,
            preferencia,
            descricaoPerfil,
            salario
        );
    };

    // Métodos

    public void banirUsuario(Usuario usuario) {
        if (!(usuario instanceof Administrador)) {
            Sistema.usuarios.remove(usuario);
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
        Sistema.anuncios.remove(anuncio);
    };
};
