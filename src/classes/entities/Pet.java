package classes.entities;

import classes.Sistema;

public class Pet {
    private String nome;
    private String tipo;
    private int anoNascimento;
    private float peso;
    private Boolean estaVacinado;
    private Usuario dono;

    public Pet(String nome, String tipo, int anoNascimento, float peso, Boolean estaVacinado, Usuario dono) {
        this.nome = nome;
        this.tipo = tipo;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.estaVacinado = estaVacinado;
        this.dono = dono;

        this.dono.getPets().add(this);
        Sistema.getPets().add(this);
    };

    // Getters

    public String getNome() { return this.nome; }
    public String getTipo() { return this.tipo; }
    public int getAnoNascimento() { return this.anoNascimento; }
    public float getPeso() { return this.peso; }
    public Boolean getVacinaStatus() { return this.estaVacinado; }
    public Usuario getDono() { return this.dono; }
    public String getNomeDono() { return this.getDono().getNome(); }

    // Setters

    public void setNome(String novoNome) { this.nome = novoNome; }
    public void setPeso(float novoPeso) { this.peso = novoPeso; }
    public void setVacinaStatus(Boolean novoStatus) { this.estaVacinado = novoStatus; }
    public void setDono(Usuario novoDono) { this.dono = novoDono; }

    // Métodos

    public void imprimirDados() {
        System.out.println("nome: " + this.getNome());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("anoNascimento: " + this.getAnoNascimento());
        System.out.println("peso: " + this.getPeso());
        System.out.println("estaVacinado: " + this.getVacinaStatus());
        System.out.println("dono: " + this.getDono().getNomeUsuario());
    };
};
