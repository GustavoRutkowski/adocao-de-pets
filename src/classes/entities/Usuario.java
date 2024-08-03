package classes.entities;

import java.util.ArrayList;

import classes.Sistema;

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

    public Usuario(String nomeUsuario, String nomeCompleto, String email, String senha, String preferencia, String descricaoPerfil, double salario) throws Exception {
        if (Sistema.getUsuarioPorNome("@" + nomeUsuario) != null) {
            throw new Exception("\u001B[31mNome de usuário já existe.\u001B[0m");
        };
        
        this.nomeUsuario = "@" + nomeUsuario;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.preferencia = preferencia; // gato, cachorro ou ambos 
        this.descricaoPerfil = descricaoPerfil;
        this.salario = salario;
        this.pets = new ArrayList<>();
        this.solicitacoes = new ArrayList<>();
        this.anuncios = new ArrayList<>();

        Sistema.getUsuarios().add(this);
    };

    // Getters

    public String getNomeUsuario() { return this.nomeUsuario; }
    public String getNome() { return this.nomeCompleto; }
    public String getEmail() { return this.email; }
    public String getSenha() { return this.senha; }
    public String getPreferencia() { return this.preferencia; }
    public String getDescricao() { return this.descricaoPerfil; }
    public double getSalario() { return this.salario; }
    public ArrayList<Pet> getPets() { return this.pets; }
    public ArrayList<SolicitacaoAdocao> getSolicitacoes() { return this.solicitacoes; }
    public ArrayList<Anuncio> getAnuncios() { return this.anuncios; }

    // Setters

    public void setNomeUsuario(String novoNome) { this.nomeUsuario = novoNome; }
    public void setSenha(String novaSenha) { this.senha = novaSenha; }
    public void setPreferencia(String novaPreferencia) { this.preferencia = novaPreferencia; }
    public void setDescricao(String novaDescricao) { this.descricaoPerfil = novaDescricao; }
    public void setSalario(double novoSalario) { this.salario = novoSalario; }

    // Métodos

    public void solicitarAdocao(Anuncio anuncio) {
        if (!anuncio.getAutor().equals(this)) {
            SolicitacaoAdocao solicitacao = new SolicitacaoAdocao(anuncio, this);
    
            this.solicitacoes.add(solicitacao);
            Sistema.getSolicitacoes().add(solicitacao);
        };
    };

    public void cancelarSolicitacao(SolicitacaoAdocao solicitacao) {
        this.solicitacoes.remove(solicitacao);
        Sistema.getSolicitacoes().remove(solicitacao);
    };

    public void cadastrarAnuncio(Pet pet, String descricao) {
        if (pet.getDono().equals(this)) {
            Anuncio anuncio = new Anuncio(this, descricao, pet);
    
            this.anuncios.add(anuncio);
            Sistema.getAnuncios().add(anuncio);
        };
    };

    public void editarAnuncio(Anuncio anuncio, String novaDescricao) {
        if (anuncio.getAutor().equals(this)) {
            anuncio.setDescricao(novaDescricao);
        };
    };

    public void removerAnuncio(Anuncio anuncio) {
        this.anuncios.remove(anuncio);
        Sistema.getAnuncios().remove(anuncio);
    };

    public void resolverAdocao(SolicitacaoAdocao adocao, Boolean foiAceita) {
        if (adocao.getAnuncio().getAutor().equals(this)) {
            if (!foiAceita) {
                adocao.setStatus("rejeitada");
                return;
            };
            
            adocao.setStatus("aceita");
        };
    };

    public void imprimirDados() {
        System.out.println("nomeUsuario: " + this.getNomeUsuario());
        System.out.println("nomeCompleto: " + this.getNome());
        System.out.println("email: " + this.getEmail());
        System.out.println("senha: " + this.getEmail());
        System.out.println("preferencia: " + this.getPreferencia());
        System.out.println("descricaoPerfil: " + this.getDescricao());
        System.out.println("salario: " + this.getSalario());

        if (!this.getPets().isEmpty()) {
            System.out.println("pets: ");
            for (int i = 0; i < this.getPets().size(); i++) {
                System.out.println("- " + this.getPets().get(i).getNome());
            };
        };

        if (!this.getSolicitacoes().isEmpty()) {
            System.out.println("solicitacoes: ");
            for (int i = 0; i < this.getSolicitacoes().size(); i++) {
                System.out.println("- " + this.getSolicitacoes().get(i));
            };
        };

        if (!this.getAnuncios().isEmpty()) {
            System.out.println("anuncios: ");
            for (int i = 0; i < this.getAnuncios().size(); i++) {
                System.out.println("- " + this.getAnuncios().get(i).getDescricao());
            };
        };
    }; 
};
