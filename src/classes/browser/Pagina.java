package classes.browser;

import java.util.ArrayList;

import interfaces.browser.Componente;

// import java.util.ArrayList;
// import java.util.Scanner;

// Criar sub-classes chamadas de "Layouts".
// Eles seriam uma forma de padronizar páginas semelhantes.
// Ex.:
// 1. Páginas de Listas de Usuários, Pets, Admins, Anúncios, Solicitações...
// 2. Páginas de Perfil

public class Pagina {
    private String titulo;
    private String url;
    private ArrayList<Componente> componentes;

    public Pagina(String titulo, String url) throws Exception {
        if (Navegador.getPaginaPorURL(url) != null) {
            throw new Exception("\u001B[31mURL já existente.\u001B[0m");  
        };

        this.titulo = titulo;
        this.url = url;
        this.componentes = new ArrayList<>();

        Navegador.getPaginas().add(this);

        if (Navegador.getPaginas().size() == 1) {
            Navegador.setPaginaAtual(this);
            Navegador.renderizarPagina();
        };
    };

    // Getters

    public String getTitulo() {
        return this.titulo;
    };

    public String getURL() {
        return this.url;
    };

    public ArrayList<Componente> getComponentes() {
        return this.componentes;
    };

    // Setter

    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    };
};
