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

    // Getters

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

    // Métodos

    public void imprimirDados() {
        System.out.println(this.getNome());
        System.out.println(this.getDescricao());
        System.out.println(this.getDono());
    };
};
