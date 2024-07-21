package classes.entities;

public class SolicitacaoAdocao {
    private String status; // pendente/rejeitada/aceita 
    private Anuncio anuncio;
    private Usuario autor;

    public SolicitacaoAdocao(Anuncio anuncio, Usuario autor) {
        this.status = "pendente";
        this.anuncio = anuncio;
        this.autor = autor;
    };

    // Getters

    public String getStatus() { return this.status; }
    public Anuncio getAnuncio() { return this.anuncio; }
    public Usuario getAutor() { return this.autor; }

    // Setter

    public void setStatus(String novoStatus) { this.status = novoStatus; }

    // Métodos

    public void imprimirDados() {
        System.out.println("status: " + this.getStatus());
        System.out.println("anuncio: " + this.getAnuncio());
        System.out.println("autor: " + this.getAutor());
    };
};