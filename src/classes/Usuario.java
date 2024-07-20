package classes;

import java.util.ArrayList;

public class Usuario {
    private String nomeUsuario; // Nickname ou apelido qualquer
    private String nomeCompleto; // Nome completo Real da pessoa
    private String email;
    private String senha;
    // Ajuda a saber sobre as notificações que o usuário deseja receber.
    private String preferencia;
    private String descricaoPerfil;
    private double salario;
    private ArrayList<Pet> pets; // ArrayList de Pets

    public Usuario(String nomeUsuario, String nomeCompleto, String email, String senha, String preferencia, String descricaoPerfil, double salario) {
        this.nomeUsuario = nomeUsuario;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.preferencia = preferencia;
        this.descricaoPerfil = descricaoPerfil;
        this.salario = salario;
        this.pets = new ArrayList<>();
    };

    public String getNomeUsuario() {
        return this.nomeUsuario;
    };

    public String getNome() {
        return this.nomeCompleto;
    };

    public String getEmail() {
        return this.email;
    };

    public String getSenha() {
        return this.senha;
    };

    public String getPreferencia() {
        return this.preferencia;
    }

    public double getSalario() {
        return this.salario;
    };

    public ArrayList<Pet> getPets() {
        return this.pets;
    };

    public void cadastrarPet(Pet pet, Anuncio anuncio) {
        // Implementar lógica para cadastrar um novo Pet...
    };

    public void resolverAdocao(Adocao adocao, Boolean foiAceita) {
        // Resolve um pedido de adoção
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

        for (int i = 0; i < this.pets.size(); i++) {
            System.out.println(this.getPets().get(i).getNome());
        };
    }; 
};
