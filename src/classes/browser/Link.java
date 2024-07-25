package classes.browser;

public class Link {
    private String nomeLink;
    private Pagina referencia;

    public Link(String nomeLink, Pagina referencia) {
        this.nomeLink = nomeLink;
        this.referencia = referencia;
    };

    // Getters

    public String getNomeLink() {
        return this.nomeLink;
    };

    public Pagina getReferencia() {
        return this.referencia;
    };

    // Setter

    public void setNomeLink(String novoNomeLink) {
        this.nomeLink = novoNomeLink;
    };

    public void setReferencia(Pagina novaReferencia) {
        this.referencia = novaReferencia;
    };    
};
