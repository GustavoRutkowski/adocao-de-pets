package classes.browser;

public class Log {
    public static void tentativaInvalida() {
        String codigoVermelho = "\u001B[31m";
        String codigoReseta = "\u001B[0m";
        String mensagemErro = "Reposta Inválida! Tente novamente!";

        System.out.printf("%s%s%s%n", codigoVermelho, mensagemErro, codigoReseta);
    };
};
