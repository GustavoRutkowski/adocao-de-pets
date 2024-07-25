package classes.browser.components;

import java.util.ArrayList;
import java.util.Scanner;
import classes.browser.Link;
import classes.browser.Navegador;
import classes.browser.Pagina;
import interfaces.Componente;

public class Links implements Componente {
    private ArrayList<Link> links;

    public Links() {
        this.links = new ArrayList<>();
    };

    // Getter

    public ArrayList<Link> getLinks() {
        return this.links;
    };

    // Métodos

    private void gerarBotaoDeLink(int indice) {
        Link link = this.getLinks().get(indice);
            
        System.out.printf("[%d] %s%n", indice+1, link.getNomeLink());
    };

    private void redirecionarParaOLink(int numeroAcaoLink) {
        Pagina destino = links.get(numeroAcaoLink).getReferencia();
        Navegador.alterarPagina(destino);
    };

    @Override
    public void carregar() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Link> links = this.getLinks();

        for (int i = 0; i < links.size(); i++) {
            this.gerarBotaoDeLink(i);
        };

        System.out.print("Ação: ");
        int acao = sc.nextInt();
        
        redirecionarParaOLink(acao);

        sc.close();
    };
};
