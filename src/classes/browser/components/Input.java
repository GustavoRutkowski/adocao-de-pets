package classes.browser.components;

import java.util.ArrayList;
import java.util.Scanner;
import classes.browser.Log;
import interfaces.Componente;

public class Input implements Componente {
    private String titulo;
    private ArrayList<String> respostasValidas;
    private ArrayList<String> respostasInvalidas;
    private String resposta;

    public Input(String titulo) {
        this.titulo = titulo;
        this.respostasValidas = new ArrayList<>();
        this.respostasInvalidas = new ArrayList<>();
        this.resposta = null;
    };
    
    // Getters

    public String getTitulo() {
        return this.titulo;
    };

    public ArrayList<String> getRespostasValidas() {
        return this.respostasValidas;
    };

    public ArrayList<String> getRespostasInvalidas() {
        return this.respostasInvalidas;
    };

    public String getResposta() {
        return this.resposta;
    };

    // Setter

    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    };

    public void setResposta(String novaResposta) {
        this.resposta = novaResposta;
    };

    // Métodos

    private void avaliarTentativa(String resposta) {
        Boolean ehValida = this.getRespostasValidas().contains(resposta);
        Boolean ehInvalida = this.getRespostasInvalidas().contains(resposta); 
        Boolean respostaInvalida =  !ehValida || ehInvalida;

        if (respostaInvalida) { Log.tentativaInvalida(); }
    };

    public void validarResposta(Boolean quebra) {
        Scanner sc = new Scanner(System.in);

        String resposta;
        do {
            if (quebra) {
                System.out.println(this.getTitulo());
            } else {
                System.out.print(this.getTitulo());
            };

            resposta = sc.nextLine();
            
            Boolean semRespostasValidas = respostasValidas.isEmpty();
            Boolean semRespostasInvalidas = respostasInvalidas.isEmpty();
            Boolean nenhumaValidacao = semRespostasValidas && semRespostasInvalidas;
            if (nenhumaValidacao) { break; }

            avaliarTentativa(resposta);
        } while (!respostasValidas.contains(resposta));

        this.setResposta(resposta);

        sc.close();
    };

    @Override
    public void carregar() {
        this.validarResposta(false);
    };
};
