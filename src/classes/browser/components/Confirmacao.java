package classes.browser.components;

public class Confirmacao extends Input {
    public Confirmacao(String titulo) {
        super(titulo);
    };

    @Override
    public void carregar() {
        this.validarResposta(true);
    };
};
