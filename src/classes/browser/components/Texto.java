package classes.browser.components;

import interfaces.browser.Componente;

public class Texto implements Componente {
    private String conteudo;

    public Texto(String conteudo) {
        this.conteudo = conteudo;
    };

    // Getter

    public String getConteudo() {
        return this.conteudo;
    };

    // Setter

    public void setConteudo(String novoConteudo) {
        this.conteudo = novoConteudo;
    };

    // Métodos

    @Override
    public void carregar() {
        System.out.println(this.getConteudo());
        System.out.println(); //  Substituir por caractere de quebra. 
    };
};
