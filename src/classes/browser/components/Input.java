package classes.browser.components;

import java.util.ArrayList;
import java.util.Scanner;
import interfaces.Componente;

public class Input implements Componente {
    private String titulo;
    private ArrayList<String> restricoes;
    private String resposta;

    public Input(String titulo) {
        this.titulo = titulo;
        this.restricoes = new ArrayList<>();
        this.resposta = null;
    };

    // Getters

    public String getTitulo() {
        return this.titulo;
    };

    public ArrayList<String> getRestricoes() {
        return this.restricoes;
    };

    public String getResposta() {
        return this.resposta;
    };

    // Setters

    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    };

    public void setResposta(String novaResposta) {
        this.resposta = novaResposta;
    };

    // Método

    @Override
    public void carregar() {
        Scanner sc = new Scanner(System.in);

        System.out.print(this.getTitulo());

        String resposta = sc.nextLine();
        this.setResposta(resposta);

        sc.close();
    };
};
