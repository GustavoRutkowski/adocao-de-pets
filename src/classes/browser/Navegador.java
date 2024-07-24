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

    public static ArrayList<Pagina> getPaginas() {
        return paginas;
    };

    public static Pagina getPaginaAtual() {
        return paginaAtual;
    };

    public static Pagina getPaginaAnterior() {
        return paginaAnterior;
    };

    public static Pagina getPaginaSeguinte() {
        return paginaSeguinte;
    };

    // Setters

    public static void setPaginaAtual(Pagina novaPaginaAtual) {
        paginaAtual = novaPaginaAtual;
    };

    public static void setPaginaAnterior(Pagina novaPaginaAnterior) {
        paginaAnterior = novaPaginaAnterior;
    };

    public static void setPaginaSeguinte(Pagina novaPaginaSeguinte) {
        paginaSeguinte = novaPaginaSeguinte;
    };

    // Métodos

    private static void renderizarHeader() {
        int larguraLinha = 80;
        String titulo = paginaAtual.getTitulo();
        int tamanhoTitulo = titulo.length();
        int espacamentoTitulo = (larguraLinha - tamanhoTitulo) / 2;
        String espacos = " ".repeat(espacamentoTitulo);

        System.out.println("-".repeat(larguraLinha));
        System.out.println(espacos + titulo + espacos);
        System.out.println("-".repeat(larguraLinha));
    };

    private static void renderizarComponentes() {
        ArrayList<Componente> componentes = paginaAtual.getComponentes();

        for (int i = 0; i < componentes.size(); i++) {
            Componente componente = componentes.get(i);

            componente.carregar();
        };
    };

    public static void renderizarPagina() {
        renderizarHeader();
        renderizarComponentes();
    };

    public static void alterarPagina(int indice) {
        int indiceAtual = paginas.indexOf(paginaAtual);
        int novoIndiceAtual = indiceAtual + indice;

        paginaAtual = paginas.get(novoIndiceAtual);
        paginaAnterior = paginas.get(novoIndiceAtual-indice);
        paginaSeguinte = paginas.get(indiceAtual+indice);
    };

    public static void alterarPagina(Pagina pagina) {
        int indiceRedirecao = paginas.indexOf(pagina);

        setPaginaAtual(paginas.get(indiceRedirecao));
        setPaginaAnterior(paginas.get(indiceRedirecao-1));
        setPaginaSeguinte(paginas.get(indiceRedirecao));
        paginaSeguinte = paginas.get(indiceRedirecao+1);
    };

    public static void irParaPaginaAnterior() {
        int indicePaginaAtual = paginas.indexOf(paginaAtual);
        alterarPagina(indicePaginaAtual-1);
    };

    public static void irParaPaginaSeguinte() {
        int indicePaginaAtual = paginas.indexOf(paginaAtual);
        alterarPagina(indicePaginaAtual+1);
    };
};
