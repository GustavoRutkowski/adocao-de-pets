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
        // Implementar a lógica de banir o usuário...
    };

    public void editarDescricaoUsuario(Usuario usuario, String novaDescricao) {
        // Implementar lógica de editar descrição do usuário...
    };

    public void editarAnuncio(Anuncio anuncio, String novaDescricao) {
        // Implementar a lógica de editar um anúncio como administrador...
    };

    public void removerAnuncio(Anuncio anuncio) {
        // Implementar lógica de remover anúncio como administrador...
    };
};
