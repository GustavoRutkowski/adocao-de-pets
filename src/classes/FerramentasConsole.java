package classes;

public class FerramentasConsole {
    public static void escreverTitulo(String titulo) {
        int numLinhas = 86;
        int tamanhoTitulo = titulo.length();
        int numEspaços = (numLinhas - tamanhoTitulo) / 2;
        String espacos = " ".repeat(numEspaços);

        System.out.println("-".repeat(numLinhas));
        System.out.println(espacos + titulo + espacos);
        System.out.println("-".repeat(numLinhas));
        System.out.println();
    }

    // Não fazemos a mínima ideia de como esse código funciona, só sabemos que ele limpa a tela.
    public static void limpar() throws Exception {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }
}
