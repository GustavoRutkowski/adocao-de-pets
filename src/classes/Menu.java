package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String titulo;
    private String conteudo;
    private ArrayList<Menu> links;

    public Menu(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    };

    // Getters

    public String getTitulo() { return this.titulo; }
    public String getConteudo() { return this.conteudo; }
    public ArrayList<Menu> getLinks() { return links; }

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
        String linhaTitulo = espacos + this.titulo + espacos;

        System.out.println(linha);
        System.out.println(linhaTitulo);
        System.out.println(linha);
    };

    public void mostrarConteudo() {
        System.out.println(this.conteudo + "\n");
    };

    public void mostrarLinks() {
        for (int i = 1; i <= this.links.size(); i++) {
            String linkTitle = this.links.get(i).titulo;
            System.out.printf("[%d] - Ir para %s%n", i, linkTitle);
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

        do {
            System.out.print("Ação: ");

            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();

            sc.close();

            if (resposta > this.links.size()) {
                this.tentativaInvalida();
            };
        } while (resposta > this.links.size());

        this.links.get(resposta).mostrarMenu();
    };
};
