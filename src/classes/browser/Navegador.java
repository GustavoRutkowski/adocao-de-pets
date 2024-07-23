package classes.browser;

import java.util.ArrayList;

public class Navegador {
    private static ArrayList<Pagina> paginas;
    private static Pagina paginaAtual;
    private static Pagina paginaAnterior;
    private static Pagina paginaSeguinte;

    public Navegador() {
        paginas = new ArrayList<>();
        paginaAtual = null;
        paginaAnterior = null;
        paginaSeguinte = null;
    };

    // Getters

    public ArrayList<Pagina> getPaginas() {
        return paginas;
    };

    public Pagina getPaginaAtual() {
        return paginaAtual;
    };

    public Pagina getPaginaAnterior() {
        return paginaAnterior;
    };

    public Pagina getPaginaSeguinte() {
        return paginaSeguinte;
    };

    // Setters

    public void setPaginaAtual(Pagina novaPaginaAtual) {
        paginaAtual = novaPaginaAtual;
    };

    public void setPaginaAnterior(Pagina novaPaginaAnterior) {
        paginaAnterior = novaPaginaAnterior;
    };

    public void setPaginaSeguinte(Pagina novaPaginaSeguinte) {
        paginaSeguinte = novaPaginaSeguinte;
    };

    // Métodos

    private void alterarPagina(int incremento) {
        int indiceAtual = paginas.indexOf(paginaAtual);
        int indiceAnterior = paginas.indexOf(paginaAnterior);
        int indiceSeguinte = paginas.indexOf(paginaSeguinte);
    
        paginaAtual = paginas.get(indiceAtual+incremento);
        paginaAnterior = paginas.get(indiceAnterior+incremento);
        paginaSeguinte = paginas.get(indiceSeguinte+incremento);
    };

    public void irParaPaginaSeguinte() {
        alterarPagina(1);
    };

    public void irParaPaginaAnterior() {
        alterarPagina(-1);
    };
};
