package classes;

import java.util.ArrayList;

public class Usuario {
    private String nomeUsuario;
    private String nomeCompleto;
    private String email;
    private String senha;
    private String preferencia;
    private String descricaoPerfil;
    private double salario;
    private ArrayList<Pet> pets;
    private ArrayList<SolicitacaoAdocao> solicitacoes;
    private ArrayList<Anuncio> anuncios;

    public Usuario(String nomeUsuario, String nomeCompleto, String email, String senha, String preferencia, String descricaoPerfil, double salario) {
        this.nomeUsuario = nomeUsuario;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.preferencia = preferencia;
        this.descricaoPerfil = descricaoPerfil;
        this.salario = salario;
        this.pets = new ArrayList<>();
        this.solicitacoes = new ArrayList<>();
    };

    // Getters

    public String getNomeUsuario() { return this.nomeUsuario; }
    public String getNome() { return this.nomeCompleto; }
    public String getEmail() { return this.email; }
    public String getSenha() { return this.senha; }
    public String getPreferencia() { return this.preferencia; }
    public double getSalario() { return this.salario; }
    public ArrayList<Pet> getPets() { return this.pets; }
    public ArrayList<SolicitacaoAdocao> getSolicitacoes() { return this.solicitacoes; }
    public ArrayList<Anuncio> getAnuncios() { return this.anuncios; }

    // Métodos

    public void solicitarAdocao(Anuncio anuncio) {
        // Implementar a lógica para solicitar uma adoção...
    };

    public void cancelarSolicitacao(SolicitacaoAdocao solicitacao) {
        // Implementar a lógica de cancelar solicitação...
    };

    public void cadastrarAnuncio(Pet pet, String descricao) {
        // Implementar a lógica de cadastrar um novo anúncio de pet...
    };

    public void editarAnuncio(Anuncio anuncio, String novaDescricao) {
        // Implementar a lógica de editar um anúncio de pet...
    };

    public void removerAnuncio(Anuncio anuncio) {
        // Implementar lógica de remover anúncios de pets...
    };

    public void resolverAdocao(SolicitacaoAdocao adocao, Boolean foiAceita) {
        // Resolve um pedido de adoção...
    };

    public void imprimirDados() {
        System.out.println("nomeUsuario: " + this.getNomeUsuario());
        System.out.println("nomeCompleto: " + this.getNome());
        System.out.println("email: " + this.getEmail());
        System.out.println("senha: " + this.getEmail());
        System.out.println("preferencia: " + this.getPreferencia());
        System.out.println("descricaoPerfil: " + this.descricaoPerfil);
        System.out.println("salario: " + this.getSalario());
        System.out.println("pets: " + this.getPets());

        for (int i = 0; i < this.getPets().size(); i++) {
            System.out.println(this.getPets().get(i));
        };

        System.out.println("solicitacoes: " + this.getSolicitacoes());
        
        for (int i = 0; i < this.getSolicitacoes().size(); i++) {
            System.out.println(this.getSolicitacoes().get(i));
        };

        System.out.println("anuncios: " + this.getAnuncios());

        for (int i = 0; i < this.getAnuncios().size(); i++) {
            System.out.println(this.getAnuncios().get(i));
        };
    }; 
};
