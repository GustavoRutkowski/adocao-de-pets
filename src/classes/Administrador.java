package classes;

public class Administrador extends Usuario {
    public Administrador(String nomeUsuario, String nomeCompleto, String email, String senha, String preferencia, String descricaoPerfil, double salario) {
        super(nomeUsuario, nomeCompleto, email, senha, preferencia, descricaoPerfil, salario);
    };

    public void banirUsuario(Usuario usuario) {
        // Implementar a lógica de banir o usuário...
    };

    public void removerAnuncio(Anuncio anuncio) {
        // Implementar a lógica de remover anúncio...        
    };

    public void editarAnuncio(Anuncio anuncio) {
        // Implementar a lógica de editar um anúncio.
    };
};
