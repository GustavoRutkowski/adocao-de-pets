package classes;

public class Pet {
    private String nome;
    private String descricao;
    private Usuario dono;

    public Pet(String nome, String descricao, Usuario dono) {
        this.nome = nome;
        this.descricao = descricao;
        this.dono = dono;
    };

    public String getNome() {
        return this.nome;
    };

    public String getDescricao() {
        return this.descricao;
    }

    public Usuario getDono() {
        return this.dono;
    };

    public String getNomeDono() {
        return this.getDono().getNome();
    };

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.dono);
    };
};
