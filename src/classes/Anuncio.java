package classes;

import java.util.ArrayList;

public class Anuncio {
    private String descricao;
    private Pet pet;
    private ArrayList<SolicitacaoAdocao> solicitacoes;

    public Anuncio(String descricao, Pet pet) {
        this.descricao = descricao;
        this.pet = pet;
        this.solicitacoes = new ArrayList<>();
    };

    // Getters

    public String getDescricao() { return this.descricao; }
    public Pet getPet() { return this.pet; }
    public ArrayList<SolicitacaoAdocao> getSolicitacoes() { return this.solicitacoes; }

    // Setters

    public void setDescricao(String novaDescricao) { this.descricao = novaDescricao; }

    // Métodos

    public void imprimirDados() {
        System.out.println("descricao: " + this.getDescricao());
        System.out.println("pet: " + this.getPet());
        System.out.println("solicitacoes: " + this.getSolicitacoes());

        for (int i = 0; i < this.getSolicitacoes().size(); i++) {
            System.out.println(this.getSolicitacoes().get(i));
        };
    };
};
