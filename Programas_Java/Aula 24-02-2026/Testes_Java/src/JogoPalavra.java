import java.util.Scanner;

public class JogoPalavra {

    static String resposta = "perto";
    static int numeroDeTentativas = 6;
    static int tamanhoDaResposta = resposta.length();
    static char[] letrasAcertadas = new char[tamanhoDaResposta];

    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("\n".repeat(50));
        }
    }

    public static void conferencia(String chute) {
        for (char letra : chute.toCharArray()) {
            if (resposta.indexOf(letra) != -1) {
                System.out.println("A letra '" + letra + "' está na resposta");
            }
        }

        for (int i = 0; i < resposta.length(); i++) {
            if (chute.charAt(i) == resposta.charAt(i)) {
                letrasAcertadas[i] = chute.charAt(i);
            }
        }
    }

    public static void tentativas() {
        numeroDeTentativas--;

        if (numeroDeTentativas >= 1) {
            System.out.println("Você tem mais " + numeroDeTentativas + " tentativas");
        }

        if (numeroDeTentativas == 0) {
            limparTerminal();
            System.out.println("Acabaram as tentativas");
            System.out.println("A palavra era '" + resposta + "'. Obrigado por jogar!!!");
        }
    }

    public static boolean checarTentativas() {
        return numeroDeTentativas == 0;
    }

    public static void simbolo() {
        System.out.println();
        for (char c : letrasAcertadas) {
            if (c == '\u0000') {
                System.out.print("_ ");
            } else {
                System.out.print(c + " ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inicializa com "_"
        for (int i = 0; i < letrasAcertadas.length; i++) {
            letrasAcertadas[i] = '\u0000';
        }

        while (true) {

            simbolo();
            System.out.print("Insira a palavra: ");
            String guess = scanner.nextLine();

            if (guess.isEmpty()) {
                System.out.println("Por favor insira algo!");
                continue;
            }

            if (guess.length() != tamanhoDaResposta) {
                System.out.println("A palavra digitada deve possuir " + tamanhoDaResposta + " letras");
                continue;
            }

            if (guess.equals(resposta)) {
                System.out.println("Parabéns, a resposta era '" + resposta + "'");
                break;
            }

            conferencia(guess);

            tentativas();
            if (checarTentativas()) {
                break;
            }

            System.out.print("Aperte enter para continuar (ou digite 'sair'): ");
            String continuar = scanner.nextLine();

            if (continuar.equalsIgnoreCase("sair")) {
                System.out.println("Obrigado por jogar");
                break;
            } else {
                limparTerminal();
            }
        }

        scanner.close();
    }
}