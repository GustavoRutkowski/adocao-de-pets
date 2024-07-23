package classes.browser;

import java.util.ArrayList;
import java.util.Scanner;

// Modificar menu para:
/*
 * Ser mais versátil com a forma que as coisas são apresentadas
 * (botões de resposta, lidar com o histórico entre as páginas, etc)
 * O sistema terá um histórico e terá páginas.
 * Cada página pode ser construída através de:
 * Texto
 * Botões de links
 * Perguntas de Sim ou Não (Confirms)
 * Perguntas de Resposta em texto (Inputs)
 * Redirects automáticos para outras páginas
 * Também deverão haver páginas padronizadas (como páginas de perfil, listas de usuários, pets, anúncios e solicitações)
 * Cada tipo de página terá uma subclasse para facilitar na criação.
 * 
 * Em Resumo:
 * Termos um Histórico, esse histórico terá Páginas.
 * Essas Páginas podem ser compostas de Componentes
 * Esses Componentes podem ser:
 *  Texto,
 *  Botões de Link,
 *  Perguntas de Sim ou Não (Confirms)
 *  Caixas de Texto (Inputs)
 *  Redirects
 * 
 * Além disso, teríamos como criar Páginas mais específicas.
 * Como teremos várias páginas de perfil, é interessante ter uma classe para construir esse padrão.
 * Também é interessante ter uma classe de listas (de usuários, pets, solicitações, anúncios, etc.)
 * */

public class Pagina {
    private String titulo;
    private String conteudo;
    private ArrayList<Pagina> links;

    public Pagina(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.links = new ArrayList<>();
    };

    // Getters

    public String getTitulo() { return this.titulo; }
    public String getConteudo() { return this.conteudo; }
    public ArrayList<Pagina> getLinks() { return links; }

    // Setters

    public void setTitulo(String novoTitulo) { this.titulo = novoTitulo; }
    public void setConteudo(String novoConteudo) { this.conteudo = novoConteudo; }

    public void limparMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    };

    public void mostrarTitulo() {
        int tamanhoLinha = 90;
        int espacamento = (tamanhoLinha - this.titulo.length()) / 2;

        String espacos = " ".repeat(espacamento);
        String linha = "-".repeat(tamanhoLinha);
        String linhaTitulo = espacos + this.titulo.toUpperCase() + espacos;

        System.out.println(linha);
        System.out.println(linhaTitulo);
        System.out.println(linha + "\n");
    };

    public void mostrarConteudo() {
        System.out.println(this.conteudo + "\n");
    };

    public void mostrarLinks() {
        for (int i = 0; i < this.getLinks().size(); i++) {
            String linkTitle = this.getLinks().get(i).titulo;
            System.out.printf("[%d] - Ir para %s%n", i+1, linkTitle);
        };
    };

    public void tentativaInvalida() {
        String resetCode = "\u001B[0m";
        String redColorCode = "\u001B[31m";

        System.out.println(redColorCode + "Tentativa inválida!" + resetCode);
    };
    
    public void mostrarMenu() {
        this.limparMenu();
        this.mostrarTitulo();
        this.mostrarConteudo();
        this.mostrarLinks();

        int resposta;
        
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ação: ");

            resposta = sc.nextInt();
            sc.nextLine();

            if (resposta > this.getLinks().size()) {
                this.tentativaInvalida();
            };
        } while (resposta > this.getLinks().size());

        this.getLinks().get(resposta-1).mostrarMenu();
        sc.close();
    };
};
